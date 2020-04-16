package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest1
 * @Description 获取Stream的方式
 * @Author liangxp
 * @Date 2020/4/15 10:37
 **/
public class StreamTest1 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello stream");

        String[] sArrays = new String[]{"hello", "world", "hello stream"};
        Stream<String> stream1 = Stream.of(sArrays);
        Stream<String> stream2 = Arrays.stream(sArrays);

        List<String> list = Arrays.asList(sArrays);
        Stream<String> stream3 = list.stream();


    }
}
