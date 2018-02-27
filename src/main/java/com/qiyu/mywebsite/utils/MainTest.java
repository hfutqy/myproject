package com.qiyu.mywebsite.utils;

/**
 * 测试类
 */
public class MainTest {
    public static void main(String[] agrs) {
        int[] arr = {2, 5, 1, 7, 3, 9, 6, 12, 3, 6, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int e : arr)
            System.out.print(e + " ");
    }

    /**
     * 快排
     */
    static void quickSort(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        int key = arr[l];
        while (l < h) {
            while (l < h && arr[h] > key)//处理右侧比Key大
                h--;
            if (l < h) {
                int tmp = arr[h];
                arr[h] = arr[l];
                arr[l] = tmp;
                l++;
            }
            while (l < h && arr[l] < key)//处理左侧比key小
                l++;
            if (l < h) {
                int tmp = arr[h];
                arr[h] = arr[l];
                arr[l] = tmp;
                h--;
            }
        }
        if (l > low)
            quickSort(arr, low, l - 1);
        if (h < high)
            quickSort(arr, h + 1, high);
    }
}
