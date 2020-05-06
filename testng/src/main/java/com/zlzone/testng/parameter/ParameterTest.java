package com.zlzone.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 8:50 PM
 * @version:
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }
}
