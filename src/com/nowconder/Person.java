package com.nowconder;

/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/10/21
 */
public class Person extends Animal {
    private String country;

    public Person(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    /**
     * 多态
     */
    @Override
    public void say(){
        System.out.println("This is person from " + country);
    }
}
