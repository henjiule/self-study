package cn.itcast.demo.README.day04;

/**
 * @ClassName TestStudent
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/14
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三丰";
        s.age = 141;
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println("---------");

        s.study();
        

    }
}
