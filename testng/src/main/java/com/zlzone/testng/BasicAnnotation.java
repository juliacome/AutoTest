package com.zlzone.testng;

import org.testng.annotations.*;

/**
 * @Description:
 *
 * @author: julia
 * @Date: 2020/5/6 10:52 AM
 * @version:
 *
 * 运行结果：beforesuit->beforeclass->beforemethod->方法1->aftermethod->beforemethod->方法2->aftermethod->afterclass->aftersuit
 */
public class BasicAnnotation {
    @Test
    public void testCase01() {
        System.out.println("base test run...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("在测试方法之前运行的方法");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("在测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("在套件suit之前");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("在套件suit之后");
    }
}
