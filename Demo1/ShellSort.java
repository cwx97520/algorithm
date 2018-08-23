package Demo1;

public class ShellSort extends SortSet{
    public int[] sort(int[] array) {
        int len = array.length;
        for (int gap = len / 2; gap >= 1; gap = gap / 2) {
            for (int i = gap; i < len; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap]; j = j - gap) {
                    SortUtil.swap(array, j, j + gap);
                }
            }
        }
        return array;
    }
}
