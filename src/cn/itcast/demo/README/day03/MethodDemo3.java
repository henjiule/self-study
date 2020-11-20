package cn.itcast.demo.README.day03;

/**
 * @ClassName MethodDemo3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/20
 **/
public class MethodDemo3 {
    public static void main(String[] args) {
        //调用方法
        boolean c = compare(10,20);
        System.out.println(c);
    }//main方法结束标记
    public static boolean compare(int a , int b ) {
        return a==b;
    }//compare方法结束的标记
}//MethodDemo3类结束的标记
