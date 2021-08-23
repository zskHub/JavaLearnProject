package cn.zsk.basic.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-14   22:30
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        Map<String, Object> currentMap = new ConcurrentHashMap<>();
        currentMap.put("key1", "value1");
    }
}

