package cn.itcast.demo.README.day02;

import java.util.Random;

/**
 * @ClassName RandomDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/15
 **/
public class RandomDemo1 {
    public static void main(String[] args) {
       Random r = new Random();
//        int num = r.nextInt(10);
//        System.out.println(num);
        for (int i = 0; i <10 ; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
            
        }
    }
}
