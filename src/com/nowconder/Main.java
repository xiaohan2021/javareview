package com.nowconder;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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

    /**
     * 控制流演示
     */
    public static void demoControlFlow(){
        int a = 2;
        int target = a == 2 ? 1 : 3;
        print(1, target);
        if (a == 2){
            target = 1;
        } else {
            target = 3;
        }
        print(2, target);
        String grade = "B";
        switch (grade){
            case "A":
                print(3, ">80");
                break; // switch遇到break结束
            case "B":
                print(4,"60-80");
                break;
            case "C":
                print(5,"<60");
                break;
            default:
                print(6,"未知");
                break;
        }
        for (int i = 0; i < 4; ++i) {
            if(i == 0){
                continue;
            }
            print(7,i);
            if(i == 2){
                break;
            }
        }
        int score = 60;
        while (score <= 100){
            print(8,score);
            score += 20;
        }
    }

    /**
     * ArrayList演示
     */
    private static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i*i)); // int转String
        }
        print(1,strList);

        List<String> stringListB = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            stringListB.add(String.valueOf(i));
        }
        strList.addAll(stringListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1)); // 1的String对象
        print(4,strList);
        print(5,strList.get(1)); // 角标1的元素

        Collections.reverse(strList); // 反过来
        print(6,strList);

        Collections.sort(strList); // 排序
        print(7,strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 降序 o2 > o1 结果>0 所以是降序
            }
        });
        print(8,strList);

        for(String obj : strList){ // 遍历
            print(9,obj);
        }

        for (int i = 0; i < strList.size(); i++) {
            print(10,strList.get(i));
        }

        int[] array = new int[]{1,2,3};
        print(11,array[1]);

    }

    /**
     * HashMap & HashTable演示
     */
    private static void demoMapTable() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1,map);

        for(Map.Entry<String, String> entry : map.entrySet()){
            print(2,entry.getKey() + " | " + entry.getValue());
        }

        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
        map.replace("3", "27");
        print(7,map.get("3"));
    }

    /**
     * Set集合演示
     */
    private static void demoSet() {
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 3; i++) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        print(4,strSet.isEmpty());
        print(5,strSet.size());

        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(6, strSet);

        for(String str : strSet){ // 遍历
            print(7,str);
        }

    }

    /**
     * 异常
     */
    private static void demoException() {
        try {
            int k = 2;
            // k = k / 0;
            if(k == 2){
                throw new Exception("数据异常");
            }
        } catch (Exception e){
            print(2,e.getMessage());
        } finally {
            print(3,"finally");
        }
    }

    /**
     * 面向对象，万物皆对象
     * 封装、接口、继承、多态
     */
    public static void demoOO(){
        Animal a = new Animal("jim", 1);
        a.say();
        Animal person = new Person("Lei", 22, "China");
        person.say();
    }

    /**
     * 随机数/时间
     */
    private static void demoFunction() {
        Random random = new Random(); // 随机数
        random.setSeed(1); // 指定种子
        print(1,random.nextInt(1000));
        print(2,random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5,6});
        Collections.shuffle(array); // 随机打乱顺序
        print(3,array);

        Date date = new Date(); // 时间
        print(4,date);
        print(5,date.getTime());

        DateFormat df  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 时间格式
        print(6,df.format(date));

        print(7,UUID.randomUUID()); // 随机ID

        print(8,Math.log(10));
        print(9,Math.min(3,10));
        print(10,Math.max(3,10));
        print(11,Math.ceil(2.2)); // 向上取整
        print(12,Math.floor(2.2)); // 向下取整

    }

    public static void main(String[] args) {
        // print(1,"Hello World 1"); // 打印
        // demoOperation(); // 运算符
        // demoString(); // 字符串
        // demoControlFlow(); // 控制流
        // demoList(); // 有序集合
        // demoMapTable(); // map和table
        // demoSet(); // 无序集合
        // demoException(); // 异常
        // demoOO(); // 面向对象
        demoFunction(); // 随机数和时间
    }




}
