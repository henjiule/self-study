package cn.itcast.demo.README.day02;

/**
 * @ClassName WhileDemo2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class WhileDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1 ;
        while ( a<=100 )  {
              sum+=a;
              a++;


        }
        System.out.println("sum:" +  sum);
    }
}
