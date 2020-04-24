package cn.itcost.day08.demo03;

/*
  获得数组长度的格式:数组名称.Length


  数组一旦创立，程序运行期间，长度不能改变
 */

public class Demo03ArrayLength {
        public static void main(String[] args) {

            int[] arrayA={5,4,6,85,41,635,41,6,85,4,6};

            int len=arrayA.length;
            System.out.println("数组长度为"+len);

            int[] arrayB=new int[3];
            System.out.println(arrayB.length);

            arrayB=new int[5];
            System.out.println(arrayB.length);//这并不是一个数组，而是两个数组


        }
}
