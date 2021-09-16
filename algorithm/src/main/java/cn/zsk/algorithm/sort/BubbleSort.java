package cn.zsk.algorithm.sort;

import com.alibaba.fastjson.JSON;

/**
 * 冒泡排序
 *
 * @Author : zsk
 * @CreateTime : 2021-06-01   17:31
 */
public class BubbleSort {

    public static void doBubbleSort(Integer[] arr){
        if (null == arr || arr.length < 0){
            System.out.println("冒泡排序，传入数组为空");
            return ;
        }
        if (arr.length == 1){
            System.out.println("冒泡排序，传入数组长度为1.");
            return ;
        }

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j ++){
                if (arr[j] > arr[j + 1]){
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Integer [] arr = {3,5,4,2,8,2,10};
        System.out.println("冒泡排序，原始数组：{}" + JSON.toJSONString(arr));
        BubbleSort.doBubbleSort(arr);
        System.out.println("冒泡排序，结果数组：{}" + JSON.toJSONString(arr));

    }
}
