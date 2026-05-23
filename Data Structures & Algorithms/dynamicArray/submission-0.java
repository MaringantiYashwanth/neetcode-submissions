class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        // will initialize an empty array
        arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {

        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        // n to the end of the array
        // arr = {1, 2, 3, 4, 5}
        // n = 6
        // arr = {1, 2, 3, 4, 5, 0}
        if (size == capacity) resize();
        arr[size++] = n;
    }

    public int popback() {
        int val = arr[--size];
        arr[size] = 0;
        return val;
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(arr,0, newArray, 0, size);
        arr = newArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
