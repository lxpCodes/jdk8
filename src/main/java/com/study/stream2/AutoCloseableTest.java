package com.study.stream2;

/**
 * @ClassName AutoCloseableTest
 * @Description AutoCloseable 测试
 * @Author liangxp
 * @Date 2020/4/17 16:07
 **/
public class AutoCloseableTest implements AutoCloseable{

    public void doSomeThing(){
        System.out.println("just a test");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed invoked");
    }

    public static void main(String[] args) throws Exception {
        try(
            AutoCloseableTest autoCloseableTest = new AutoCloseableTest()
        )
        {
            autoCloseableTest.doSomeThing();
        }

    }
}
