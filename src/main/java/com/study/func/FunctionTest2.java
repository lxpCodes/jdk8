package com.study.func;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @ClassName FunctionTest2
 * @Description 学习compose与andThen
 * @Author liangxp
 * @Date 2020/4/14 9:11
 **/
public class FunctionTest2 {
    public static void main(String[] args) {

        FunctionTest2 test = new FunctionTest2();
        //传一个参数返回一个
        System.out.println(test.compute(2,value -> value * 3, value -> value * value));
        System.out.println(test.compute2(2,value -> value * 3, value -> value * value));

        //传两个参数返回一个
        System.out.println(test.compute3(2,3,(value1,value2) -> value1 + value2));
        System.out.println(test.compute3(2,3,(value1,value2) -> value1 - value2));
        System.out.println(test.compute3(2,3,(value1,value2) -> value1 * value2));
        System.out.println(test.compute3(2,3,(value1,value2) -> value1 / value2));

        System.out.println(test.compute4(2,3,(value1,value2) -> value1 + value2, value -> value * value));

    }

    public int compute(int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> bigFunction){
        return bigFunction.apply(a,b);
    }

    public int compute4(int a, int b, BiFunction<Integer,Integer,Integer> bigFunction, Function<Integer,Integer> function){
        return bigFunction.andThen(function).apply(a,b);
    }

}
