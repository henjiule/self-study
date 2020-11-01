package cn.itcast.demo.README.day01;

/**
 * @ClassName IfDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/1
 **/

public class IfDemo1 {
    public static void main(String[] args) {
        System.out.println("开始执行");

        //定义两个int型变量
        int a = 10;
        int b = 20;


        if (a == b) {
            //如果能走到这里，说明条件成立
            System.out.println("a和b是相等的");

        }

        System.out.println("结束执行");
    }
}
