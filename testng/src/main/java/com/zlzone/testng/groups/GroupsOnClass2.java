package com.zlzone.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @author: julia
 * @Date: 2020/5/6 8:36 PM
 * @version:
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2222运行");
    }
}
