package com.study.method;
import	java.util.function.Function;
import	java.util.List;

import javax.rmi.CORBA.StubDelegate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @ClassName MethodReferenceTest
 * @Description 方法引用
 * @Author liangxp
 * @Date 2020/4/14 16:07
 **/
public class MethodReferenceTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);


        System.out.println("===========================");
        Student student1 = new Student("zhangsan",20);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
        students.sort((studentParam1,studengParam2) ->
                Student.compareByScore(studentParam1,studengParam2));
        students.forEach(student -> System.out.println(student.getScore()));

        System.out.println("----------NO.1-----------------");
        //第一种方法引用：类名::静态方法名 等价于上面的写法
        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));

        System.out.println("----------No.2------------------");
        //第二种：引用名::实例方法名
        StudentComparator studentComparator = new StudentComparator();
        students.sort((studentParam1,studentParam2) -> studentComparator.compareByScore(studentParam1,studentParam2));
        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("=============================");
        students.sort(studentComparator::compareByScore);
        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("=============================");
        students.sort(studentComparator::compareByName);
        students.forEach(student -> System.out.println(student.getName()));

        System.out.println("----------No.3------------------");
        students.sort(Student::compareStuByScore);
        students.forEach(student -> System.out.println(student.getScore()));

        System.out.println("----------No.4------------------");
        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));

        System.out.println(methodReferenceTest.getString2("liangxp",String::new));


    }

    public String getString(Supplier<String> supplier){
        return supplier.get() + "test";
    }

    public String getString2(String str,Function<String,String> function){
        return function.apply(str);
    }
}
