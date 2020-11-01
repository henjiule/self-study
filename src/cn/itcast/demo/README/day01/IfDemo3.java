package cn.itcast.demo.README.day01;

/**
 * @ClassName IfDemo3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/1
 **/
public class IfDemo3 {
    public static void main(String[] args) {
        int time = 25;

        if (time >=0 && time <= 12) {
            System.out.println("早上好");
        } else if (time >=13 && time <=18) {
            System.out.println("下午好");
        } else if (time >= 19 && time <=24) {
            System.out.println("晚上好");
        } else {
            System.out.println("我不知道你在说什么");
        }

    }
}
