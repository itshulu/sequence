package test;

import com.sl.allsort.SelectSort;

import java.util.Arrays;

/**
 * 选择排序
 * @author ShuLu
 */
public class SelectSortTest {
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        Integer[] arry={21,25,49,27,16,8};
        Arrays.toString(selectSort.sort(arry));
    }
}
