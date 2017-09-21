/**
 * Created by Administrator on 2017/9/18 0018.
 */
public class StaticTest {
    static int cnt = 6;
    static{
        System.out.println("第一个静态代码块执行");
        cnt+=9;
    }

    static{
        System.out.println("第二个静态代码块执行");
        cnt/=3;
    }
    {
        System.out.println("构造代码块");
    }
    public static void main(String[] args) {
        System.out.println("主函数执行"+cnt);
        StaticTest staticTest = new StaticTest();
    }

    public StaticTest(){
        System.out.println("构造函数执行");
    }

}
