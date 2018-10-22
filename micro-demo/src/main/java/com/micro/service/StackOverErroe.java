package com.micro.service;


/**
 * 栈深度
 * */
public class StackOverErroe {

    private int count = 0;

    public void testStack(){
        count++;
        testStack();
    };

    public void test(){
        try {
            testStack();
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("stack height:"+count);
        }
    }

    public static void main(String[] args) {
        new StackOverErroe().test();
    }
}
