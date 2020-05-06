package com.zlzone.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 9:17 PM
 * @version:
 */
public class MultiThreadOnAnnotation {

    private static int count = 0;

    /**
     * invocationCount ======>表示执行的次数
     * threadPoolSize ======>表示线程池的个数
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(count++);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
