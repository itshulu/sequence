package test;

import com.sl.allsort.HillSort;

import java.util.Arrays;

/**
 * 测试希尔排序
 * @author ShuLu
 */
public class HillSortTest {
    public static void main(String[] args) {
        HillSort hillSort = new HillSort();
        Integer[] arry={49,38,65,97,76,13,27,48,55,4};
        Arrays.toString(hillSort.sort(arry));
    }
}
