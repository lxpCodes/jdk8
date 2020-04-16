package com.study.stream2;

import com.study.method.Student;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @ClassName CollectTest1
 * @Description 阅读collect源代码与方法使用
 * @Author liangxp
 * @Date 2020/4/16 14:47
 **/
public class CollectTest1 {
    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 90);
        Student student4 = new Student("zhaoliu", 100);
        Student student5 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4,student5);

        List<Student> studentList = students.stream().collect(toList());
        studentList.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println("count: " + studentList.stream().collect(counting()));
        System.out.println("count: " + studentList.stream().count());
        System.out.println("--------------");

        //最低
        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        //最高
        students.stream().collect(maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        //平均
        System.out.println(students.stream().collect(averagingInt(Student::getScore)));
        //总和
        System.out.println(students.stream().collect(summingInt(Student::getScore)));
        //汇总结果
        IntSummaryStatistics summary = students.stream().collect(summarizingInt(Student::getScore));
        System.out.println(summary);
        System.out.println("--------------");

        //字符串连接
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",", "<begin>", "<end>")));
        System.out.println("--------------");

        //连续分组,返回结果map嵌套list
        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(map);
        System.out.println("--------------");

        //分区
        Map<Boolean, List<Student>> map2 = students.stream().collect(partitioningBy(student -> student.getScore() > 80));
        System.out.println(map2);
        System.out.println("--------------");

        //连续分区
        Map<Boolean, Map<Boolean, List<Student>>> map3 = students.stream()
                .collect(partitioningBy(student -> student.getScore() > 80, partitioningBy(stu -> stu.getScore() > 90)));
        System.out.println(map3);
        System.out.println("--------------");

        //分区统计
        Map<Boolean, Long> map4 = students.stream().collect(partitioningBy(student -> student.getScore() > 80, counting()));
        System.out.println(map4);
        System.out.println("--------------");

        //先根据姓名分组，再取最小值
        Map<String, Student> map5 = students.stream()
                .collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)),
                        Optional::get)));
        System.out.println(map5);

    }
}
