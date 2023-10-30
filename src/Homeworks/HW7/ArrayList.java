package Homeworks.HW7;


public class ArrayList {

    private int size;
    private int[] array;

    public ArrayList() {
        size = 0;
        array = new int[10];
    }



    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity cannot be negative");
        }
        size = 0;
        array = new int[initialCapacity];
    }

    public int size(){
        return size;
    }


    //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }


    //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int number) {
        return indexOf(number) != -1;
    }

    // add element to the end of the list
    public boolean add(int number) {
        ensureCapacity();
        array[size] = number;
        size++;
        return true;
    }


    //add element on specified position
    public boolean add(int number, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        ensureCapacity();

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = number;
        size++;
        return true;
    }


    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        int removedElement = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size --;
        return removedElement;
    }


    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return array[index];
    }

    private void ensureCapacity() {
        if (size >= array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}

