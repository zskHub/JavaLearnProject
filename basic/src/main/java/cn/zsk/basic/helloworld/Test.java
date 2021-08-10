package cn.zsk.basic.helloworld;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-06-01   09:39
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ + i++);
    }
}
