import java.util.ArrayList;

public class DynamicArray {

    private int[] arr;
    private int capacity;
    private int size;

    // Constructor
    public DynamicArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    // default constructor with capacity = 2
    public DynamicArray() {
        this(2);
    }

    // Resize the array when full (double capacity)
    private void resize() {

        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        // System.out.println("Resize is called");
    }

    // Add element at the end
    public void add(int val) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = val;
    }

    // Insert at specific index
    public void insert(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == capacity) {
            resize();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
        size++;
    }

    // Remove element at index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    // Get current size
    public int size() {
        return size;
    }

    // Get capacity
    public int capacity() {
        return capacity;
    }

    // print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        da.add(10);
        da.add(20);
        da.add(30);

        da.print();
    }
};
