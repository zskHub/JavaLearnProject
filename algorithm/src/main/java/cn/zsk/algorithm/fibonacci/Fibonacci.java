package cn.zsk.algorithm.fibonacci;

/**
 * 斐波那契数列
 * @Author : zsk
 * @CreateTime : 2021-07-20   16:29
 */
public class Fibonacci {

    /**
     * 基于递归实现
     * */
    public static int fibonacci1(int n){
        if (0 == n){
            return 0;
        }
        if (1 == n){
            return 1;
        }
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    /**
     * 基于变量形式
     * */
    public static int fibonacci2(int n){
        if (n < 0){
            return -1;
        }else if (n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else {
            int c = 0;
            int a = 1;
            int b = 1;
            for (int i = 3; i <= n; i ++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    /**
     * 基于数组形式
     * */
    public static int fibonacci3(int n){
        if (n < 0){
            return -1;
        }else if (n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else {
            int[] fibAry = new int[n + 1];
            fibAry[0] = 0;
            fibAry[1] = fibAry[2] = 1;
            for (int i = 3; i <= n; i++){
                fibAry[i] = fibAry[i -1] + fibAry[i -2];
            }
            return fibAry[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci1(10));
        System.out.println(fibonacci2(10));
        System.out.println(fibonacci3(10));
    }
}
