package cn.itcast.demo.README.day03;

/**
 * @ClassName ArrayDemo6
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class ArrayDemo6 {
    public static void main(String[] args) {
        int[]arr = new int[3];
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;

        arr = null;
        System.out.println(arr[0]);
    }
}
