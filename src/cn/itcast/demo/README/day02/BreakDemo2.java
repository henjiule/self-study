package cn.itcast.demo.README.day02;

/**
 * @ClassName BreakDemo2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/15
 **/
public class BreakDemo2 {
    public static void main(String[] args) {
        Label_class:for (int i = 1; i <4 ; i++) {
            for (int j = 1; j <=10 ; j++)   {

                    System.out.println("正在查找第"+i+"个班级的第"+j+"个学生");
                    if (i==2 && j==5) {
                        System.out.println("哈哈，找到程序猿同学了，整个循环结束了");
                    break Label_class;
                    }
            }
            System.out.println();
        }
    }
}
