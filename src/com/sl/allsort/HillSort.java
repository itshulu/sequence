package com.sl.allsort;

import java.util.Arrays;

/**
 * 希尔排序
 * @author ShuLu
 */
public class HillSort {
    public Integer[] sort(Integer[] a) {
        int count = a.length;
        while (count >1) {
            if (count % 2 == 0) {
                count = count / 2 + 1;
            } else {
                count = count / 2;
            }
            for (int j=count,i=0;j<a.length;j++,i++){
                if (j==i){
                    j=j+1;
                }
                if (a[i] > a[j]) {
                    Integer temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
        return a;
    }
}
