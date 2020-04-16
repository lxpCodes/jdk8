package com.study.func;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @ClassName FunctionTest3
 * @Description Stream与BiFunction
 * @Author liangxp
 * @Date 2020/4/14 10:03
 **/
public class FunctionTest3 {
    public static void main(String[] args) {
        Person person1 = new Person(20,"zhangsan");
        Person person2 = new Person(30,"lisi");
        Person person3 = new Person(40,"wangwu");

        List<Person> persons = Arrays.asList(person1,person2, person3);

        FunctionTest3 functionTest3 = new FunctionTest3();

        List<Person> personResult = functionTest3.getPersonByName("zhangsan",persons);
        personResult.forEach(person -> System.out.println(person.getUsername()));
        System.out.println("---------------------");

        personResult = functionTest3.getPersonByAge(20,persons);
        personResult.forEach(person -> System.out.println(person.getAge()));
        System.out.println("---------------------");

        personResult = functionTest3.getPersonByAge2(30,persons,(age,personList) ->
                personList.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList()));
        personResult.forEach(person -> System.out.println(person.getAge()));


    }

    public List<Person> getPersonByName(String username, List<Person> personList){
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age,List<Person> personList){
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,persons) ->
             personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList())
        ;
        return biFunction.apply(age,personList);
    }

    public List<Person> getPersonByAge2(int age,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,personList);
    }


}
