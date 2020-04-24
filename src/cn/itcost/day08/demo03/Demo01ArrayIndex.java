package cn.itcost.day08.demo03;

/*
   索引越界异常：ArrayIndexOutOfBoundsException

   原因是索引编号写错，不存在的编号
 */

public class Demo01ArrayIndex {
    public static void main(String[] args) {

        int arrayA[]={15,25,35};

        System.out.println(arrayA[0]);

        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);


        //索引越界异常 System.out.println(arrayA[3]);
    }
}
