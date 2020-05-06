package com.zlzone.testng;

import org.testng.annotations.Test;

/**
 * @Description: 忽略测试
 * @author: julia
 * @Date: 2020/5/6 10:07 AM
 * @version:
 */
public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1 Test run...");
    }

    /**
     * 此注解忽略当前Test
     */
    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2 Test run...");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignore3 Test run...");
    }
}
