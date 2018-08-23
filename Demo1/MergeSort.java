package Demo1;

public class MergeSort extends SortSet {
    int[] array;
    int length;

    public int[] sort(int[] arr) {
        array = arr;
        length = arr.length;
        this.mergeSort(arr,0, length - 1);
        return array;
    }

    private void mergeSort(int[] arr,int l, int r) {
        if (r-l<=15) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(arr);
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        if (arr[mid]>arr[mid+1]) {
            merge(arr, l, mid, r);
        }
    }

    //归并
    protected void merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for (int i=l;i<=r;i++){
            aux[i-l] = arr[i];
        }
        //创建辅助空间aux，并且拷贝arr到aux

        int i= l;  //i指向左边没有排序的位置
        int j = mid+1; //j指向右边还没排序的位置
        for(int k = l;k<=r;k++){
            if (i>mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j>r){
                arr[k] = aux[i-l];
                i++;
            }else if (aux[i-l]<aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
}

