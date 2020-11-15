package cn.itcast.demo.README.day02;

/**
 * @ClassName ContinueDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/13
 **/
public class ContinueDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if (i%10==7 || i/10%10==7 || i%7==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
