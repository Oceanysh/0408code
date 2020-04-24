package cn.itcost.day08.demo03;

/*
    数组必须进行new初始化才能使用其中的元素，如果只是赋值了一个null，

    而没有进行new，那么会发生：空指针异常 NullPointerException

    原因：忘了new  解决：补上new
 */

public class Demo02ArrayNull {

    public static void main(String[] args) {
        int[] arrayA=null;
        System.out.println(arrayA[0]);
    }

}
