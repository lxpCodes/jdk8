package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest12
 * @Description stream分组学习
 * @Author liangxp
 * @Date 2020/4/16 11:08
 **/
public class StreamTest12 {
    public static void main(String[] args) {

        Student1 student1 = new Student1("zhangsan",100,20);
        Student1 student2 = new Student1("lisi",90,20);
        Student1 student3 = new Student1("wangwu",90,340);
        Student1 student4 = new Student1("zhangsan",80,20);

        List<Student1> student1s = Arrays.asList(student1, student2, student3, student4);

        Map<String, List<Student1>> map = student1s.stream().collect(Collectors.groupingBy(Student1::getName));

        System.out.println("-------根据姓名分组-------");
        System.out.println(map);

        Map<Integer, List<Student1>> map2 = student1s.stream().collect(Collectors.groupingBy(Student1::getSocre));

        System.out.println("-------根据分数分组------");
        System.out.println(map2);

        System.out.println("-------根据姓名统计------");
        Map<String, Long> map3 = student1s.stream().collect(Collectors.groupingBy(Student1::getName, Collectors.counting()));
        System.out.println(map3);

        System.out.println("-------根据姓名计算平均值------");

        Map<String, Double> map4 = student1s.stream().collect(Collectors.groupingBy(Student1::getName, Collectors.averagingDouble(Student1::getSocre)));
        System.out.println(map4);

        System.out.println("-------根据分数分区------------");
        Map<Boolean, List<Student1>> map5 = student1s.stream().collect(Collectors.partitioningBy(student -> student.getSocre() >= 90));
        System.out.println(map5);
        System.out.println(map5.get(false));
        System.out.println(map5.get(true));





    }
}
