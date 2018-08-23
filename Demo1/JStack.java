package Demo1;

public class JStack {
    private int[] array;
    private int maxSize;
    private  int top;

    public JStack(int size){
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    public void push(int value){
        if (top < maxSize-1){
            array[++top] = value;
        }
    }

    public int peek(){
        return array[top];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
