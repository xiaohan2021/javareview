package com.nowconder;

import java.time.Period;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/10/21
 */
public class Animal implements Talking {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void say() {
        System.out.println(name + " Animal Say");
    }
}
