package com.study.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest1
 * @Description close方法测试
 * @Author liangxp
 * @Date 2020/4/27 15:23
 **/
public class StreamTest1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "hello world");

        NullPointerException nullPointerException = new NullPointerException("my exception");

        //只抛出第一个异常，压制其他异常
        try (Stream<String> stream = list.stream()) {
            stream.onClose(() -> {
                System.out.println("aaa");
//                throw new NullPointerException("first exception");
                throw nullPointerException;
            }).onClose(() -> {
                System.out.println("bbb");
//                throw new NullPointerException("second exception");
                throw nullPointerException;
            }).forEach(System.out::println);
        }


    }
}
