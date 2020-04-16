package com.study.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StreamTest9
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/15 17:28
 **/
public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.forEach(System.out::println);

        System.out.println("哈哈哈哈哈");

//        list.stream().mapToInt(String::length).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

    }
}
