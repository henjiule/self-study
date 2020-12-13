package cn.itcast.demo.README.day04;

/**
 * @ClassName TestPhone
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/13
 **/
public class TestPhone {
    public static void main(String[] args) {
        //1.创建对象
          Phone p = new Phone();

          //2.调用成员变量并打印
        //给成员变量赋值
        p.brand ="苹果";
        p.model ="X";
        p.name = "程序猿";

        //2.打印成员变量的值
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);

        //3.调用成员方法
        System.out.println("---------");
        p.call("乔布斯");
        p.playGame();
        p.sendMessage();



    }
}
