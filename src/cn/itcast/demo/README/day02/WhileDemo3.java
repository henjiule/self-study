package cn.itcast.demo.README.day02;

/**
 * @ClassName WhileDemo3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/13
 **/
public class WhileDemo3 {
    public static void main(String[] args) {


        //1.for循环
        for (int a = 1; a <= 5; a++) {
            System.out.println("a:" + a);
        }
        System.out.println("-------------");

        //2.while循环语句
        int b = 1;
        while (b<=5){
            System.out.println("b:"+ b);
            b++;
        }
        System.out.println("b:::::::" + b);
        System.out.println("-------------");

        //3.do...while循环
        int c = 1 ;
        do {
            System.out.println("c:" + c);
            c++;
        } while (c<=5);
        System.out.println("c：：：：   ：" + c);
    }


}
