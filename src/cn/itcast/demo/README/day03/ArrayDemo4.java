package cn.itcast.demo.README.day03;

/**
 * @ClassName ArrayDemo4
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class ArrayDemo4 {
    public static void main(String[] args) {
        int [] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("--------------");

        int [] arr2 = arr1;
        arr2[2]=33;
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);


    }

}
