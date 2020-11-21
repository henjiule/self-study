package cn.itcast.demo.README.day03;

/**
 * @ClassName ArrayDemo3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //传统做法
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("数组的长度"+arr.length);
        System.out.println("数组的最大索引是"+(arr.length-1));

        System.out.println("-----------------------");


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }


    }
}
