package Demo1;

public class NumberArray {
    private int size;
    private int min;
    private int max;

    public NumberArray(int size,int min,int max){
        this.size = size;
        this.min = min;
        this.max = max;
    }

    public int[] iniCreate(){
        int[] numberArray = new int[size];
        for(int i=0;i<size;i++){
            numberArray[i] = (int) (Math.random() * (max - min)) + min;
        }
        return numberArray;
    }

    public int getSize(){
        return size;
    }

}
