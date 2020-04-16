package com.study.pred;

import java.util.function.Supplier;

/**
 * @ClassName SupplierTest
 * @Description Supplier学习
 * @Author liangxp
 * @Date 2020/4/14 11:24
 **/
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello supplier";
        System.out.println(supplier.get());

        System.out.println("-------------------");

        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());


    }

}
