package kashif.dsalgo.arrays;

public class MoshArray {

    private int[] items;
    private int count;

    public MoshArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            if (i == count - 1)
                System.out.print(items[i]);
            else
                System.out.print(items[i] + ", ");
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArray[i] = items[i];
            }

            items = newArray;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; ++i) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; ++i)
            if (item == items[i])
                return i;

        return -1;
    }

}
