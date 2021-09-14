package cn.zsk.algorithm.leetcode;

/**
 * @Author : zsk
 * @CreateTime : 2021-09-14   11:29
 */
public class TwoThreeOne {
    /**
     * 题目
     * 给定一个整数，编写一个函数来判断它是否是2的幂次方
     * */

    public static boolean isPowerOfTwo(int n){
        return n > 0 && (n & n -1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}
