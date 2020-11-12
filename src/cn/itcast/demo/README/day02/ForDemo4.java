package cn.itcast.demo.README.day02;

/**
 * @ClassName ForDemo4
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class ForDemo4 {
    public static void main(String[] args) {
        //需求；1-100所有偶数的和
        //1.定义一个求和变量sum
        int sum = 0;
        //2.获取1-100之间所有的数据
for (int i = 1; i <=100; i++) {
     //循环体
    //i的值就是1-100之间的数字 ，只要判断i是否为偶数即可
    //3.判断当前获取到的数据是否是偶数，是就累加
    if (i % 2 == 0 ) {
        sum += i;
    }

}

        //3.判断当前获取到的数据是否是偶数，是就累加，

        //4.打印结果
        System.out.println(sum);
    }
}
