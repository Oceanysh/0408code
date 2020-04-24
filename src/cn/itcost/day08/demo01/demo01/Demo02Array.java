package cn.itcost.day08.demo01.demo01;


/*
    动态初始化：指定长度
    静态初始化：指定内容


    静态初始化的基本格式：
    数据类型[] 数组名称=new 数据类型[]{元素1，元素2....};


    注意：
    静态初始化没有直接告诉长度，但是根据大括号里元素的具体内容，也可以推算出长度
 */

public class Demo02Array {
    public static void main(String[] args) {

        int[] arrayA=new int[]{5,15,25};

        String[] arrayB=new String[]{"HELLO","world","java"};

    }
}
