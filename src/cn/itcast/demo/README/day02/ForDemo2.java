package cn.itcast.demo.README.day02;

/**
 * @ClassName ForDemo2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class ForDemo2 {
    public static void main(String[] args) {
        //需求1； 打印1-5之间的数字
        //方法1； 传统做法
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("-----------");
        for (int i =1 ; i <=5 ; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");
        //需求2； 打印5-1之间的数字
     for (int i = 5 ; i>=1 ; i--) {
         System.out.println(i);
     }
    }
}
