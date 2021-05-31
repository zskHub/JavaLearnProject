package cn.zsk.concurrency.serviceImpl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-05-22   10:20
 */
@Slf4j
public class StringTest {
    public static void stringTest(){
        String a = "aa";
        String [] aList = a.split(",");
        log.info(JSON.toJSONString(aList));
    }
    public static void main(String[] args) {
        stringTest();
    }
}
