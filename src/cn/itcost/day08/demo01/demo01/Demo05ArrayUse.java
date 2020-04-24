package cn.itcost.day08.demo01.demo01;

/*
   使用动态初始化数组时，元素自动拥有一个默认值，规则如下：
    整数类型，默认为0；
    浮点类型，默认为0.0;
    字符类型，默认'\u0000';
    布尔类型，默认false
    引用类型，默认null
 */



public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);


        arrayA[1]=123;//将123赋值给array中的1号元素
        System.out.println(arrayA[1]);
    }
}
