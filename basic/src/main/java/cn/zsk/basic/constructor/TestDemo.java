package cn.zsk.basic.constructor;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-09   17:54
 */
public class TestDemo {
    public static void main(String[] args) {
        //默认有个无参构造，如果重写的有参构造。这里就必须传入值
        Parent parent = new Parent("张", "地球");

        Children children = new Children("张", "地球", "孩子", 10);


    }
}
