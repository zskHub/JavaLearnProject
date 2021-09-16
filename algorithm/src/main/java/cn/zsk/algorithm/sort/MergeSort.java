package cn.zsk.algorithm.sort;

import com.alibaba.fastjson.JSON;

/**
 * 归并排序
 *
 * @Author : zsk
 * @CreateTime : 2021-06-01   17:32
 */
public class MergeSort {
    public static int[] sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            //左右归并
            merge(a, low, mid, high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }

        System.out.println("数组排序进度：" + JSON.toJSONString(a));
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 8, 9, 1, 7, 2};
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("归并排序，原始数组：" + JSON.toJSONString(arr));
        MergeSort.sort(arr, 0, arr.length - 1);
        System.out.println("归并排序，结果数组：" + JSON.toJSONString(arr));
    }
}
