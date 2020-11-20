package cn.itcast.demo.README.day02;

/**
 * @ClassName SendOrangeDemo
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/15
 **/
public class SendOrangeDemo {
    public static void main(String[] args) {
        int count=0;

         A:for (int i = 1; i <4 ; i++) {
            for (int j = 1; j <36 ; j++) {
                if (j % 5 ==     0) {
                    continue;
                }
                System.out.println("正在给第"+i+"个班级的第"+j+"个同学发橙子" );
                count++;
                if (count>=100) {
                    break A;
                }
                
            }

        }
        System.out.println("总共发送了"+count+"个橙子");
    }
}
