package cn.itcast.demo.README.day02;

/**
 * @ClassName WhileDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class WhileDemo1 {
    public static void main(String[] args) {
        //需求；打印五次HelloWorld
        //方法1(初始化语句 判断条件语句 控制条件语句 )
        for (int i = 1 ; i <=5 ; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("---------");
        //方法2.使用while循环
        //初始化语句
        int i = 1;
        //判断条件语句
        while (i <= 5) {
            //循环体语句
            System.out.println("HelloWorld");
            //控制条件语句
            i++;

        }

    }
}
