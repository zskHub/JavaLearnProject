package cn.zsk.basic.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-14   15:51
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("firstKey","value1");
        //map的put过程，主要是扩容过程，自己去看源码吧

    }
}
