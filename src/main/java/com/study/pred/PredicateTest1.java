package com.study.pred;

import java.util.function.Predicate;

/**
 * @ClassName PredicateTest1
 * @Description Predicate学习
 * @Author liangxp
 * @Date 2020/4/14 10:23
 **/
public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;

        System.out.println(predicate.test("hellopre"));
    }
}
