package Homeworks.HW7;


public class ArrayList<T> {

    private int size;
    private Object[] array;

    public ArrayList() {
        size = 0;
        array = new Object[10];
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity cannot be negative");
        }
        size = 0;
        array = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public void add(T element) {
        ensureCapacity();
        array[size] = element;
        size++;
    }

    public void add(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        ensureCapacity();

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        T removedElement = (T) array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedElement;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        return (T) array[index];
    }

    private void ensureCapacity() {
        if (size >= array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}

