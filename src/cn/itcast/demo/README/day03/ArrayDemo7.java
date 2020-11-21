package cn.itcast.demo.README.day03;

/**
 * @ClassName ArrayDemo7
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,5,9};

        int temp = arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>temp) {
                temp = arr[i];
            }

        }
        System.out.println("数组中最大元素为"+ temp);
    }
}
