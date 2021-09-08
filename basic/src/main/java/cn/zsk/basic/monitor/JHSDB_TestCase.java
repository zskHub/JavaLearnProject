package cn.zsk.basic.monitor;

/**
 * JHSDB调试工具demo
 *
 * @Author : zsk
 * @CreateTime : 2021-09-07   23:01
 */
public class JHSDB_TestCase {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();
        void foo(){
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }

    }

    private static class ObjectHolder{}

    public static void main(String[] args) {
        Test test = new JHSDB_TestCase.Test();
        test.foo();
    }
}
