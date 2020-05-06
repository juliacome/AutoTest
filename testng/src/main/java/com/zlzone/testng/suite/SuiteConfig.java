package com.zlzone.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 3:17 PM
 * @version:
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public  void aftersuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
