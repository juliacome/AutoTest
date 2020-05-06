package com.zlzone.testng;

import org.testng.annotations.Test;

import java.sql.Time;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 10:08 PM
 * @version:
 */
public class TimeOutTest {

    /**
     * @Test(timeOut = 毫秒数) 表示期望多少毫秒内，取得响应值；如果没有，该用例就报错
     * @throws InterruptedException
     */

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}
