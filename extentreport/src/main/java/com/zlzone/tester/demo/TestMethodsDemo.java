package com.zlzone.tester.demo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/8 4:10 PM
 * @version:
 */
public class TestMethodsDemo {

    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo() {
        Reporter.log("这是我们自己写的log");
        throw new RuntimeException("这是我们自己写的运行异常");
    }
}
