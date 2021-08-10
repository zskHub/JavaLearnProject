package cn.zsk.basic.classload;

/**
 * @Author : zsk
 * @CreateTime : 2021-07-16   16:08
 */
public class MyClassLoadCheck {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /**
         * 测试从外部自己加载类。首先在C:\Users\zshua\Desktop\test\地址下新建一个helloworld.java的文件
         * 然后通过javac helloworld.java  编译一下成.class文件
         * 然后执行下这个方法，就把外部的文件加载进来了。
         * */
        MyClassLoad o = new MyClassLoad("C:\\Users\\zshua\\Desktop\\test\\", "myClassLoad");
        Class c = o.loadClass("helloworld");
        System.out.println(c.getClassLoader());
        c.newInstance();
    }
}
