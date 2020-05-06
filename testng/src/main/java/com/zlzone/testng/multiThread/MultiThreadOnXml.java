package com.zlzone.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 9:42 PM
 * @version:
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
