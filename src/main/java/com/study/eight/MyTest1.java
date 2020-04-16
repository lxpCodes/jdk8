package com.study.eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName MyTest1
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/13 10:48
 **/
public class MyTest1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("==========================");

        for (Integer i: list) {
            System.out.println(i);
        }

        System.out.println("===========================");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("===========================");
        list.forEach(integer -> System.out.println(integer));


        System.out.println("===========================");
        list.forEach(System.out::println);
    }
}
