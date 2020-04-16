package com.study.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName MyTest3
 * @Description Fcuntion学习
 * @Author liangxp
 * @Date 2020/4/13 14:59
 **/
public class MyTest3 {
    public static void main(String[] args) {

        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhaosi");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);

        Collections.sort(names,(String o1,String o2) -> {
            return o2.compareTo(o1);
        });
        System.out.println(names);

        Collections.sort(names,(o1,o2) -> o2.compareTo(o1));
        System.out.println(names);

        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);




    }
}
