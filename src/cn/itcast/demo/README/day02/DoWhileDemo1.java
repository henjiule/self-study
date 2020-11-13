package cn.itcast.demo.README.day02;

/**
 * @ClassName DoWhileDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/13
 **/
public class DoWhileDemo1 {
      public static void main(String[] args) {
        int count = 1;
        boolean isOK = false;
        do {
            System.out.println("正在进行第" + count + "次练习");
            if (count >= 3) {
                isOK = true;

            }  count++;


        } while (!isOK) ;
    }
}