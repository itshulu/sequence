package com.sl.allsort;

/**
 * 直接插入排序
 * @author ShuLu
 */
public class DirectInsertionSort {
    public Integer[] sort(Integer[] a){
        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
