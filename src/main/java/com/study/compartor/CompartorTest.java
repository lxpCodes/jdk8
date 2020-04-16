package com.study.compartor;
import	java.util.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName CompartorTest
 * @Description 比较器学习
 * @Author liangxp
 * @Date 2020/4/16 17:03
 **/
public class CompartorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

        //字符串排序
//        Collections.sort(list);
        //长度升序
//        Collections.sort(list,(item1,item2) -> item1.length() - item2.length());
        //长度降序
//        Collections.sort(list,(item1,item2) -> item2.length() - item1.length());

//        Collections.sort(list,Comparator.comparingInt(String::length).reversed());

//        Collections.sort(list,Comparator.comparingInt(item -> item.length()));
        //加了reversed()无法推断出类型,需要提前声明
//        Collections.sort(list,Comparator.comparingInt((String item) -> item.length()).reversed());
//        Collections.sort(list,Comparator.comparingInt((Object item) -> 1).reversed());

        //连续比较，后一个比较发生在前一个比较相等的情况下
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

//        Collections.sort(list,Comparator.comparingInt(String::length).
//                thenComparing((item1,item2) -> item1.toLowerCase().compareTo(item2.toLowerCase())));

//        Collections.sort(list,Comparator.comparingInt(String::length)
//                .thenComparing(Comparator.comparing(String::toLowerCase)));

//        Collections.sort(list,Comparator.comparingInt(String::length)
//                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //先长度排序，再对结果安装字母顺序逆序排序
//        Collections.sort(list,Comparator.comparingInt(String::length).reversed()
//                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));
        //结果同上
        Collections.sort(list,Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder()))
                .thenComparing(Comparator.reverseOrder()));

        System.out.println(list);


    }
}
