package com.study.pred;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 11:31
 **/
public class Student {
    private int age = 20;

    private String name = "liangxp";

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
