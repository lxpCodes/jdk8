package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest10
 * @Description FlatMap的使用
 * @Author liangxp
 * @Date 2020/4/16 10:52
 **/
public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world hello", "hello welcome");

//        List<String[]> result = list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList());

//        result.forEach(item -> Arrays.asList(item).forEach(System.out::println));
        //取出所有单词并去重
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
