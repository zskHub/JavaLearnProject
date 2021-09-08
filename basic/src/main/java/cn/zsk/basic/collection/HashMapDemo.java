package cn.zsk.basic.collection;

import com.alibaba.fastjson.JSON;

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

        Map<String, Integer> map1 = new HashMap<>(3);
        map1.put("key1", 1);
        map1.put("key2", 2);
        map1.put("key3", 3);
        map1.put("key4", 4);
        System.out.println(JSON.toJSONString(map1));
    }
}
