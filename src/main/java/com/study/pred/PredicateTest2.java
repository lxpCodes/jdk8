package com.study.pred;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName PredicateTest2
 * @Description 继续学习Predicate
 * @Author liangxp
 * @Date 2020/4/14 10:36
 **/
public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest2 predicateTest = new PredicateTest2();

        predicateTest.conditionFilter(integers,item -> item % 2 == 0);
        System.out.println("-----------------------");
        predicateTest.conditionFilter(integers,item -> item % 2 != 0);
        System.out.println("-----------------------");
        predicateTest.conditionFilter(integers,item -> item > 5);
        System.out.println("-----------------------");
        predicateTest.conditionFilter(integers,item -> item < 3);
        System.out.println("-----------------------");
        predicateTest.conditionFilter(integers,item -> true);
        System.out.println("-----------------------");
        predicateTest.conditionFilter(integers,item -> false);
        System.out.println("=======================");
        predicateTest.conditionFilter2(integers,item -> item > 5,item -> item % 2 == 0);
        System.out.println("-----------------------");
        predicateTest.conditionFilter3(integers,item -> item > 5,item -> item % 2 == 0);

        System.out.println(predicateTest.isEqual2("test").test("hhh"));
        System.out.println(predicateTest.isEqual1(new Date()).test(new Date()));


    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer: list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list,Predicate<Integer> predicate,Predicate<Integer> predicate2){
        for (Integer integer : list) {
            if (predicate.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter3(List<Integer> list,Predicate<Integer> predicate,Predicate<Integer> predicate2){
        for (Integer integer : list) {
            if (predicate.and(predicate2).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }


    public Predicate<Date> isEqual1(Object object){
        return Predicate.isEqual(object);
    }

    public Predicate<Object> isEqual2(Object object){
        return Predicate.isEqual(object);
    }


}
