package com.sl.allsort;

import java.util.Arrays;

/**
 * 选择排序
 * @author ShuLu
 */
public class SelectSort {
    public Integer[] sort(Integer[] a){
        for (int i=0;i<a.length-1;i++){
            int temp=0;
            for (int j=i;j<a.length-1;j++){
                if (a[j]<a[j+1]){
                    temp=j;
                }else {
                    temp=j+1;
                }
            }
            Integer cont=a[i];
            a[i]=a[temp];
            a[temp]=cont;
            System.out.println(Arrays.toString(a));
        }
        return a;
    }
}
