package com.study.func;

import java.util.function.Function;

/**
 * @ClassName FunctionTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/13 16:10
 **/
public class FunctionTest {
    public static void main(String[] args) {

        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(3, value ->  2 * value));
        System.out.println(functionTest.compute(2, value ->  5 + value));
        System.out.println(functionTest.compute(4, value ->  value * value));

        System.out.println(functionTest.convert(5,value -> value + "helloworlds"));

    }


    public int compute(int a, Function<Integer,Integer> function){
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer,String> function){
        return function.apply(a);
    }
}
