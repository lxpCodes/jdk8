package com.study.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName StreamTest8
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/15 16:40
 **/
public class StreamTest8 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("start sort");

        long startTime = System.nanoTime();

//        list.stream().sorted().count();
        list.parallelStream().sorted().count();
        long endTime = System.nanoTime();

        System.out.println("cost times:" + TimeUnit.NANOSECONDS.toMillis(endTime - startTime));



    }
}
