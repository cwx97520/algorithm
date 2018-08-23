package Demo1;

public class BubbleSort extends SortSet{
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int max = 0;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[max] < array[j + 1]) {
                    max = j+1;
                }
            }
            SortUtil.swap(array,max,array.length-i-1);
        }
        return array;
    }
}