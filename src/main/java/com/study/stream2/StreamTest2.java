package com.study.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StreamTest2
 * @Description Stream学习
 * @Author liangxp
 * @Date 2020/4/27 15:45
 **/
public class StreamTest2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().forEach(System.out::println);
    }
}
