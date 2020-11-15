package cn.itcast.demo.README.day02;

/**
 * @ClassName ForForDemo
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/13
 **/
public class ForForDemo {
    public static void main(String[] args) {
        for (int a = 1; a < 4; a++) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("正在获取第"+ a +"个班级的第"+i+"名同学");
            }
            System.out.println();
        }
    }
}
