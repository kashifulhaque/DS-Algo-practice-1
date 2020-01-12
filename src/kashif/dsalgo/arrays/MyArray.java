package kashif.dsalgo.arrays;

import java.util.Arrays;

public class MyArray {

    private int[] theArray;
    private int size;
    private int top;

    public MyArray(int size) {
        this.size = size;
        theArray = new int[size];
        top = -1;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void insert (int element) {
        if (isEmpty())
            throw new IllegalStateException();

        top++;
        if (top == size) {
            int[] tempArray;
            tempArray = Arrays.copyOf(theArray, size);
            theArray = Arrays.copyOf(tempArray, size * 2);
            size *= 2;
        }
        theArray[top] = element;
    }

    public void removeAt (int deleteIndex) {
        // Check if the given index to delete is within the bounds of the Array
        if (deleteIndex >= 0 && deleteIndex <= top)
            if (top + 1 - deleteIndex + 1 >= 0) {
                System.arraycopy(theArray, deleteIndex + 1, theArray, deleteIndex, top + 1 - deleteIndex + 1);
                top--;
            }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int indexOf (int element) {
        if (isEmpty())
            throw new IllegalStateException();

        for (int i = 0; i < size; i++)
            if (element == theArray[i])
                return i;

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(theArray);
    }

}
