package com.nowconder;

/**
 * @Description: 叶神牛客知乎问答社区前导课--Java基础复习(注释、字符串、运算符、变量)
 * @Author: 小韩同学
 * @Date: 2020/10/19
 */
public class Main {

    // 1、单行注释

    /*
      2、多行注释
    */

    /**
     * 3、文档注释，会被写进javadoc
     */


    /**
     * 打印内容
     * @param index 索引
     * @param object 对象
     */
    public static void print(int index, Object object){
        System.out.println(String.format("{%d}, %s", index, object.toString()));
    }

    public static void main(String[] args) {
        print(1,"Hello World 1");
        print(2,"Hello World 2");

    }
}
