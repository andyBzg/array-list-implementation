public class ArrayListImplementation {

    private int[] array;
    private int size;


    public ArrayListImplementation(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }


    public void add(int element) {
        if (array.length == size) {
            grow();
        }

        array[size] = element;
        size++;
    }

    private void grow() {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];
        //переложить все значения из старого в новый
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        return "]";
    }

    public void remove(int index) {
        int[] firstArray = new int[index];
        for (int i = 0; i < index; i++) {
            firstArray[i] = array[i];
        }

        int[] secondArray = new int[array.length - index];
        for (int i = index + 1; i < size; i++) {
            secondArray[i - index - 1] = array[i];
        }

        int[] mergedArrays = new int[array.length];
        int position = 0;
        for (int i : firstArray) {
            mergedArrays[position] = i;
            position++;
        }
        for (int i : secondArray) {
            mergedArrays[position] = i;
            position++;
        }

        array = mergedArrays;
        size--;
    }

}
