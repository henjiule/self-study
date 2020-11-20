package cn.itcast.demo.README.day02;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName RandomDemo2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public class RandomDemo2 {
    public static void main(String[] args) {
        Random r  = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请录入您要猜的数字(1-100)");
            int guessNum =  sc.nextInt();
            if (guessNum > num) {
                System.out.println("您猜大了");
            }else if (guessNum < num) {
                System.out.println("您猜小了");
            }else  {
                System.out.println("恭喜您猜对了，请找小黑领取奖品");
                break;

            }

        }

        }

        }



