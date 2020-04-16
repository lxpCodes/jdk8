package com.study.func;

/**
 * @ClassName Person
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/14 10:00
 **/
public class Person {
    private int age;
    private String username;


    public Person(int age, String username) {
        this.age = age;
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
