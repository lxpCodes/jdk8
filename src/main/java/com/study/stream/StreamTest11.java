package com.study.stream;
import	java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StreamTest11
 * @Description 学习Stream
 * @Author liangxp
 * @Date 2020/4/16 10:57
 **/
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        //两个list实现字符串两两拼接
        List<String> collect = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}
