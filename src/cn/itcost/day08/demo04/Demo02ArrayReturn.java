package cn.itcost.day08.demo04;

/*
  一个方法可以有多个参数，但只能有0或1个返回值
  如果一个方法产生了多个结果要返回，要用数组
 */

public class Demo02ArrayReturn {

    public static void main(String[] args) {

        int[] result=calculate(10,20,30);
        System.out.println(result[0]);

        System.out.println(result[1]);

    }

    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;

        int[]array ={sum,avg};
        /*
          int[]array=new int[2];

          array[0]=sum;

          array[1]=avg;
         */
        return array;
    }
}
