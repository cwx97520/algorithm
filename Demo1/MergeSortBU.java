package Demo1;

import static java.lang.Math.min;

public class MergeSortBU extends MergeSort {
    public int[] sot(int[] arr) {
        for (int sz = 1; sz <= arr.length; sz += sz) {
            for (int i = 0; i + sz < arr.length; i += sz + sz) {
                merge(arr, i, i + sz - 1, min((i + sz + sz - 1), arr.length - 1));
            }
        }
        return arr;
    }
}
