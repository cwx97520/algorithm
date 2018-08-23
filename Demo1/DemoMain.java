package Demo1;

import java.util.Arrays;

public class DemoMain {
    public static void main(String[] args) {
        NumberArray numberArray = new NumberArray(50000, 0, 100);
        int[] array = numberArray.iniCreate();
        int[] clone1 = array.clone();
        int[] clone2 = array.clone();
        int[] clone3 = array.clone();
        int[] clone4 = array.clone();
        int[] clone5 = array.clone();
        System.out.println(Arrays.toString(array));
        //创建数组 并且输出

        TestSort testSelectionSort = new TestSort();
        testSelectionSort.test(new InsertionSort(), clone1);
        testSelectionSort.test(new ShellSort(), clone2);
        testSelectionSort.test(new SelectionSort(), clone3);
        testSelectionSort.test(new BubbleSort(), clone4);
        testSelectionSort.test(new MergeSort(), clone5);

    }
}
