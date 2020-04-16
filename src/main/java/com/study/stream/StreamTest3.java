package com.study.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StreamTest3
 * @Description List求和新方式
 * @Author liangxp
 * @Date 2020/4/15 10:47
 **/
public class StreamTest3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);


        System.out.println(list.stream().map( i -> i * 2).reduce(Integer::sum).get());
    }
}
