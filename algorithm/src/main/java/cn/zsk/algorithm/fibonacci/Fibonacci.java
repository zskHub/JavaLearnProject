package cn.zsk.algorithm.fibonacci;

/**
 * 斐波那契数列
 * @Author : zsk
 * @CreateTime : 2021-07-20   16:29
 */
public class Fibonacci {
    public static  int fibonacci(int n){
        if (0 == n){
            return 0;
        }
        if (1 == n){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
