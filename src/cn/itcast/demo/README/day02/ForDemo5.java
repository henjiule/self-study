package cn.itcast.demo.README.day02;

/**
 * @ClassName ForDemo5
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class ForDemo5 {
    public static void main(String[] args) {
        /*
        打印所有的水仙花数
        水仙花解释；指的是一个三位数，其各个数字的立方和等于它本身。 例如：
           1*1*1 + 5*5*5 +3*3*3=153
        */

        //1.通过for循环获取所有三位数
        for (int i = 100; i < 1000 ; i++) {
            //i表示的是所有3位数
            //2.获取该数据的个位，十位，百位数字。
            int ge = i % 10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            //3.判断该数字是否是水仙花，如果是，直接打印即刻。
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                //能走到这里，说明i是水仙花数
                System.out.println(i);
            }

        }
    }
}
