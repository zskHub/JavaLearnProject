package cn.zsk.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 快速排序
 *
 * @Author : zsk
 * @CreateTime : 2021-06-01   17:32
 */
@Slf4j
public class QuickSort {
    public static void doQuickSort(int[] source, int left, int right) {
        if (left > right){
            log.error("左边的下标值大于右边的了。直接返回了");
            return;
        }
        int i = left;
        int j = right;
        //设置基准值,将数组第一个值作为了基准值
        int base = source[left];
        //左右两个不相遇
        while (i != j){

            //注意，这里顺序很重要，要先从右往左找。不然到下面i = j，交换基数时会产生问题。
            //哨兵j从右往左走，找到第一个比基准值小的值
            while (i < j && source[j] >= base){
                j --;
            }

            //哨兵i从左往右走，找到第一个比基准值大的元素
            while (i < j && source[i] <= base){
                i ++;
            }

            //交换哨兵i和j的数据
            if (i < j){
                int temp = source[j];
                source[j] = source[i];
                source[i] = temp;
            }
        }

        //哨兵相遇后，交换基准值与当前的数值
        int temp = source[j];
        source[j] = source[left];
        source[left] = temp;

        //当前位置，左边的都比基数小然后递归
        doQuickSort(source, left, i -1);

        //当前位置，左边的都比基数小然后递归
        doQuickSort(source, i +1, right);
    }

    /**
     * 交换a,b两个位置的元素
     *
     * @param a 位置a
     * @param b 位置b
     */
    public static void swap(int[] source, int a, int b) {
        int temp = source[a];
        source[a] = source[b];
        source[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 8, 9};
        log.info("快速排序，原始数组：{}", JSON.toJSONString(arr));
        QuickSort.doQuickSort(arr, 0, arr.length - 1);
        log.info("快速排序，结果数组：{}", JSON.toJSONString(arr));
    }
}
