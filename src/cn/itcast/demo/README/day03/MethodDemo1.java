package cn.itcast.demo.README.day03;

/**
 * @ClassName MethodDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/20
 **/

/*
 方法的定义格式
 修饰符 返回值的类型 方法名（参数类型 参数名1，参数类型 参数名2）
 */
public class MethodDemo1 {
    public static void main(String[] args) {

         int x = sum(30,4);
        System.out.println(x);

    }
    /*
    方法与方法之间是平级的关系，不能嵌套定义
     */

    //定义一个方法，用来获取两个整数和.
    public static int sum (int a ,int b ){
        int c = a + b;
        return c;

    }
}
