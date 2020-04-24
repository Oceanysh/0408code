package cn.itcost.day08.demo03;

/*
   数组的反转：
   {1,2,3,4}

   {4,3,2,1}
 */

public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] arrayA={5,10,15,20,25};

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }


        for (int min=0,max=arrayA.length-1; min<max;min++,max--){

            int temp;
            temp=arrayA[min];
            arrayA[min]=arrayA[max];
            arrayA[max]=temp;


        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);

        }


    }
}
