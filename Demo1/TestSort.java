package Demo1;

import java.util.Arrays;

public class TestSort {
    public void test(SortSet aSort, int[] array){
        long starTime = System.currentTimeMillis();
        int[] endArray = aSort.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println(aSort.getClass().getName()+"当前耗时"+(endTime - starTime)+"ms");
        System.out.println(Arrays.toString(endArray));
    }
}
