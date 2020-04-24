package cn.itcost.day08.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {

        int[] arrayA={5,15,25,35,45};

        int max=arrayA[0];
        for (int i = 0; i < arrayA.length; i++) {

            if (arrayA[i]>max){


                max=arrayA[i];
            }


        }

        System.out.println(max);
    }
}
