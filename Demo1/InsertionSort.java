package Demo1;

public class InsertionSort extends SortSet{
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            //拷贝一份当前的数
            int j;
            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;

        }
        return array;
    }
}
