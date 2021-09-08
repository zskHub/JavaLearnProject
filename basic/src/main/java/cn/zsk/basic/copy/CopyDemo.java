package cn.zsk.basic.copy;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-30   10:01
 */
@Slf4j
public class CopyDemo {
    /**
     * 直接复制，浅拷贝，修改其中某一个，另一个也会改变
     * */
    public static void copy1(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        log.info("list1:{}", JSON.toJSONString(list1));
        List<Integer> list2 = new ArrayList<>();
        list2 = list1;
        log.info("list2:{}", JSON.toJSONString(list2));
        list1.add(3);
        log.info("list1修改后，list2:{}", JSON.toJSONString(list2));
    }
    public static void main(String[] args) {
       copy1();
    }
}
