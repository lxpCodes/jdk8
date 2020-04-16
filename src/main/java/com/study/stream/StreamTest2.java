package com.study.stream;

import java.util.stream.IntStream;

/**
 * @ClassName StreamTest2
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/15 10:42
 **/
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{3,4,5}).forEach(System.out::println);

        System.out.println("--------------------");

        IntStream.range(3,8).forEach(System.out::println);

        System.out.println("--------------------");

        IntStream.rangeClosed(3,8).forEach(System.out::println);


    }
}
