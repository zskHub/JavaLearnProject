package cn.zsk.basic.classload;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-11   18:23
 */
public class Test {

    static Integer i = 1;

    static{
        i = 0;
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(Test.i);
    }
}
