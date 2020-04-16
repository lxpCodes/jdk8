package hello;

import java.time.LocalTime;

/**
 * @ClassName MyFirstGradleJava
 * @Description 第一个使gradle编译的java程序
 * @Author liangxp
 * @Date 2020/4/13 9:59
 **/
public class MyFirstGradleJava {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("current time : " + now);

    }
}
