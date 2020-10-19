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

    /**
     *  运算符演示
     */
    public static void demoOperation(){
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 / 2);
        print(5, 5 % 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 | 2); // 或运算 0x101 0x10
        print(9, 5 ^ 2); // 异或运算
        print(10, 5 == 2);
        print(11, 5 != 2);
        print(12, 5.0 / 2); // 浮点运算
        print(13, 5 / 2.0);

        int a = 11;
        double b = 2.2f;
        a += 2;
        print(14,a);

    }

    /**
     *  字符串演示
     */
    public static void demoString() {
        String str = "hello world";
        print(1, str.indexOf('e'));
        print(2, str.indexOf('x'));
        print(3, str.charAt(6));
        print(4, str.codePointAt(1));
        print(5, str.compareToIgnoreCase("HELLO WORLD"));
        print(6, str.compareTo("hello vorld"));// u v w x y z
        print(7, str.compareTo("hello xorld"));// u v w x y z
        print(8, str.contains("hello")); // 拼接
        print(9, str.toUpperCase());
        print(10, str.endsWith("world"));
        print(11, str.startsWith("hell"));
        print(12, str.replace('o', 'e'));
        print(13, str.replaceAll("o|l", "a")); // 正则表达式
        print(14, str.replaceAll("hello", "hi")); // 字符串替换
        print(15, str + str);

        // 字符串的随机操作，可变字符数组
        // 注意：StringBuffer是非线程安全的
        StringBuffer sb = new StringBuffer();
        sb.append("x ");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        print(16, sb.toString());

    }
    public static void main(String[] args) {
        // print(1,"Hello World 1"); // 打印
        // demoOperation(); // 运算符
        demoString(); // 字符串

    }


}
