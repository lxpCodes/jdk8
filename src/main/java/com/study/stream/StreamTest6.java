package com.study.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest6
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/15 14:42
 **/
public class StreamTest6 {
    private Stream<Integer> stream1;

    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        Stream<String> stream = Stream.generate(""::toString);
        stream.findFirst().ifPresent(System.out::println);

        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
        System.out.println("---------------------");

        Stream<Integer> stream1 = Stream.iterate(1, item -> item + 2).limit(6);
//        stream1.filter(item -> item > 2).mapToInt(item -> item * 2).forEach(System.out::println);
//        System.out.println(stream1.filter(item -> item > 200).mapToInt(item -> item * 2).skip(2).limit(2).sum());;
//        stream1.filter(item -> item > 200).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);

//        IntSummaryStatistics intSummaryStatistics = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
//        System.out.println(intSummaryStatistics.getMax() + " " + intSummaryStatistics.getSum() + " " + intSummaryStatistics.getMin());

        //会报错stream has already been operated upon or closed
//        System.out.println(stream1);
//        System.out.println(stream1.filter(item -> item > 2));
//        System.out.println(stream1.distinct());

        System.out.println(stream1);
        Stream<Integer> stream2 = stream1.filter(item -> item > 2);
        System.out.println(stream2);
        Stream<Integer> stream3 = stream2.distinct();
        System.out.println(stream3);


    }
}
