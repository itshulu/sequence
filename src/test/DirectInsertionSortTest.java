package test;

import com.sl.allsort.DirectInsertionSort;

import java.util.Arrays;

/**
 * 测试直接插入排序
 * @author ShuLu
 */
public class DirectInsertionSortTest {
    public static void main(String[] args) {
        DirectInsertionSort directInsertionSort = new DirectInsertionSort();
        Integer[] arry={13,6,3,31,9,27,5,11};
        Arrays.toString(directInsertionSort.sort(arry));
    }
}
