package com.study.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest5
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/15 14:25
 **/
public class StreamTest5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "liangxp", "stream");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list1.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------");


        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
//        listStream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);
        listStream.flatMap(Collection::stream).map(item -> item * item).forEach(System.out::println);


    }
}
