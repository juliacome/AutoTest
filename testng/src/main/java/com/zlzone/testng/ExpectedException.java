package com.zlzone.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 8:42 PM
 * @version:
 */
public class ExpectedException {

    /**
     * 什么时候会用到异常测试？？
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说预期结果就是这个异常。
     */


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个fail exception");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个success exception");
        int i = 10/0;
    }
}
