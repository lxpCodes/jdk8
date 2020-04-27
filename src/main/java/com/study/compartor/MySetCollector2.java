package com.study.compartor;
import	java.util.stream.Collector.Characteristics;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @ClassName MySetCollector2
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/17 10:38
 **/
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
//        return HashSet<T>::new;
        return () -> {
            System.out.println("----------");
            return new HashSet<T>();
        };
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set, item) -> {
            System.out.println("accumulator: " +  Thread.currentThread().getName() + set);
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1, set2) -> {
            System.out.println("set1" + set1);
            System.out.println("set2" + set2);
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked");
        return set -> {
            Map<T,T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item,item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        //使用Characteristics.IDENTITY_FINISH会直接进行强制类型转换，不需要调用finisher方法
        //使用Characteristics.CONCURRENT，中间结果容器只有一个，否则根据线程数而定容器数量
        //combiner取决于调用并行流，并且characteristics没有使用Characteristics.CONCURRENT
        //使用并行流且不使用Characteristics.CONCURRENT会有多个中间结果容器
        for (int i = 0; i < 1; i++) {
            List<String> list = Arrays.asList("hello", "world", "welcome", "hello","a","b","c","d","e","f","g");
            Set<String> set = new HashSet<> ();
            set.addAll(list);

            System.out.println("set: " + set);

//        Map<String, String> map = set.stream().collect(new MySetCollector2<>());
//            Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
//            Map<String, String> map = set.stream().parallel().collect(new MySetCollector2<>());
//            Map<String, String> map = set.stream().sequential().collect(new MySetCollector2<>());
            //只看最后一个调用，所以调用还是并行
//            Map<String, String> map = set.stream().sequential().parallel().sequential().parallel().collect(new MySetCollector2<>());
            Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
            System.out.println("map: " + map);
        }



    }
}
