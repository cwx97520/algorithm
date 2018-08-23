package Demo1;

/**
 * 选择排序 每次选出最小的数字 与 对应的序数交换
 */
public class SelectionSort extends SortSet{
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int MinInt = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[MinInt]) {
                    MinInt = j;
                }
            }
            SortUtil.swap(array, i, MinInt);
        }
        return array;
    }
}
