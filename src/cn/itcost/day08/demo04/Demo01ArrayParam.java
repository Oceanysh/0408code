package cn.itcost.day08.demo04;

/*
    数组可以作为方法的参数

    调用方法时，向方法小括号进行传参，传递进去的其实是数组的地址值
 */

public class Demo01ArrayParam {

    public static void main(String[] args) {

        int[] array = {5, 10, 6, 7, 88, 9};

        printArray(array);
        System.out.println( "======aaaaaa========");

        printArray(array);
        System.out.println("=======bbbbb======");
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}
