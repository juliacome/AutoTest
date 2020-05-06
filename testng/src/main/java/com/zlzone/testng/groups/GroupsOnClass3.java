package com.zlzone.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 8:37 PM
 * @version:
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
