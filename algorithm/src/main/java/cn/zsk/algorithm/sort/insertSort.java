package cn.zsk.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 插入排序
 *
 * @Author : zsk
 * @CreateTime : 2021-08-29   21:18
 */
public class insertSort {
    public static void sort(int [] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        System.out.println("原始数组信息：" + JSON.toJSONString(arr));
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("最终的结果：" + JSON.toJSONString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {2,3,10,4,5,7,12};
        sort(arr);
    }
}
