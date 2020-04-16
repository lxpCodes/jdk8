package com.study.option;

import java.util.Optional;

/**
 * @ClassName OptionalTest
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 15:13
 **/
public class OptionalTest {
    public static void main(String[] args) {

//        Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.empty();

        //不推荐
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        System.out.println("-------推荐方式-------");
        optional.ifPresent(item -> System.out.println(item));

        optional = Optional.empty();
        System.out.println(optional.orElse("world"));
        System.out.println("----------------------");

        optional = Optional.empty();
        System.out.println(optional.orElseGet(() -> "hhhh"));


    }
}
