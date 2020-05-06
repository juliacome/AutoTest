package com.zlzone.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 8:47 PM
 * @version:
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    /**
     * 依赖的测试方法执行失败，调用依赖的当前测试方法不执行。
     */

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
