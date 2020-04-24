package cn.itcost.day08.demo01.demo01;

/*
        使用静态初始化数组时，格式还可以省略一下

        数据类型[] 数组名称={元素1，元素2，元素3....};


        注意：
        静态初始化的标准格式，可以拆分成两个步骤；

        静态初始化一旦使用省略格式，就不能拆分成两个步骤了

        动态初始化也可以

        使用建议：
        如果不确定数组的具体内容，用动态初始化；否则，确定了初试内容，用静态初始化

 */


public class Demo03Array {
    public static void main(String[] args) {

        int[] arrayA={15,25,5};


        int[] arrayB;
        arrayB =new int[]{56,55,89};


        int[] arrayC;
        arrayC=new int[3];

    }
}
