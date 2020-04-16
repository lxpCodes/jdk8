package com.study.eight;

/**
 * @ClassName MyInterface1
 * @Description TODO
 * @Author liangxp
 * @Date 2020/4/13 11:11
 **/
@FunctionalInterface
public interface MyInterface2 {
    void test1();


    String toString();
}

class Test2 {
    public void myTest(MyInterface2 myInterface2) {
        System.out.println(1);
        myInterface2.test1();
        System.out.println(2);
    }


    public static void main(String[] args) {
        Test2 test2 = new Test2();
        /*test2.myTest(new MyInterface2() {
            @Override
            public void test1() {
                System.out.println("mytest");
            }
        });*/
        test2.myTest(() -> {
            System.out.println("mytest");
        });

        System.out.println("==================");

        MyInterface2 myInterface2 = () -> {
            System.out.println("mytest");
        };

        test2.myTest(myInterface2);
        System.out.println(myInterface2.getClass());
        System.out.println(myInterface2.getClass().getSuperclass());
        System.out.println(myInterface2.getClass().getInterfaces().length);
        System.out.println(myInterface2.getClass().getInterfaces()[0]);

    }
}
