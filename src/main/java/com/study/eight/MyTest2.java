package com.study.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MyTest2
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/13 14:27
 **/
public class MyTest2 {

    public static void main(String[] args) {

        SpeInterface1 interface1 = () -> {};
        System.out.println(interface1.getClass().getInterfaces()[0]);

        SpeInterface2 interface2 = () -> {};
        System.out.println(interface2.getClass().getInterfaces()[0]);

        new Thread(() -> {
            System.out.println("hello lambda");
        }).start();

        List<String> list = Arrays.asList("hello","world","hello world");
        list.forEach(item -> System.out.println(item.toUpperCase()));

        System.out.println("-----------------------------");
        List<String> list2 = new ArrayList<>();
        list.forEach(item -> list2.add(item.toUpperCase()));
        list2.forEach(item -> System.out.println(item.toUpperCase()));

        System.out.println("-----------------------------");
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        System.out.println("------------------------------");
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));


    }
}

@FunctionalInterface
interface SpeInterface1 {

    void testMethod1();

}


@FunctionalInterface
interface SpeInterface2 {

    void testMethod2();

}