package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;


    }

    private void extend() {
        int[] arrbig = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arrbig[i] = array[i];
        }
        array = arrbig;
    }

    public int getByIndex(int index) {
        if (index > array.length - 1) {
            return -1;
        }
        return array[index];

    }

    public void print() {
        for (int i = 0; i < size; i++) {

        }


    }
}
