package com.study.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StreamTest9
 * @Description
 * @Author liangxp
 * @Date 2020/4/15 17:28
 **/
public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello1", "world1", "hello world");


//        list.stream().mapToInt(String::length).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        //流存在短路现象
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);


    }
}
