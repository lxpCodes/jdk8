package com.study.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest4
 * @Description Stream转为集合
 * @Author liangxp
 * @Date 2020/4/15 11:04
 **/
public class StreamTest4 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello", "stream", "hello stream");

//        String[] strings = stream.toArray(length -> new String[length]);
//        Arrays.asList(strings).forEach(System.out::println);


//        String[] strings2 = stream.toArray(String[]::new);
//        Arrays.asList(strings2).forEach(System.out::println);


//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

//        List<String> list2 = stream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
//        list2.forEach(System.out::println);

//        LinkedList<Object> linkedList = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        linkedList.forEach(System.out::println);

//        ArrayList<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
//        arrayList.forEach(System.out::println);

//        Set<String> stringSet = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(stringSet.getClass());
//        stringSet.forEach(System.out::println);

        String str = stream.collect(Collectors.joining());
        System.out.println(str);

    }
}
