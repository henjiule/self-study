package cn.itcast.demo.README.day02;

/**
 * @ClassName ForDemo3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/12
 **/
public class ForDemo3 {
    public static void main(String[] args) {


        //需求；计算1-5之间的所有数据之和。
        //1.定义求和变量sum
        int sum = 0;

        //2.通过for循环获取1-5之间的数据
        for (int i = 1; i <= 5; i++) {
            //i记录的是；1-5之间的所有数字
            //sum = sum + i;
            sum += i;
        }


        //3.把获取到的数据依次累加给变量sum
        //4.打印结果
        System.out.println(sum);

    }
}
