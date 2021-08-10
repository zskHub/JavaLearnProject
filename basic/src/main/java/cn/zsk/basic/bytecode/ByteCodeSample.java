package cn.zsk.basic.bytecode;

/**
 * 字节码分析使用
 * */
public class ByteCodeSample {
    public static void main(String[] args) {
        int i=1,j=5;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);
    }
}
