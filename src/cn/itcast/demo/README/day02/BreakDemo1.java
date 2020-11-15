package cn.itcast.demo.README.day02;

/**
 * @ClassName BreakDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/13
 **/
public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15 ; i++) {
            System.out.println("我是编号为："+ i +"的学生");

            if (i == 3) {
                System.out.println("找到编号为"+i+"的学生，循环结束");
                break;
            }

        }
    }
}
