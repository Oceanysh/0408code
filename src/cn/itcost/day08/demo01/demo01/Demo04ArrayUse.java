package cn.itcost.day08.demo01.demo01;

/*
       直接打印数组名称，得到的是数组对应内存地址的哈希值（电脑的内存条

       访问数组元素的格式：数组名称[索引值]
       索引值是一个int数字，代表数组中元素的编号
       索引值从0开始，到数组长度-1为止
 */


public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] arrayA={10,20,30};
        System.out.println(arrayA);
        System.out.println(arrayA[0]);//直接打印数组中的元素


        int num=arrayA[1];//把数组当中的某个元素赋给变量
        System.out.println(num);
    }
}
