package Homeworks.HW7;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(8);
        list.add(16);
        list.add(24);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Index of 16: " + list.indexOf(16));
        System.out.println(list.isEmpty());
        System.out.println("Contains 20: " + list.contains(20));
        list.add(19, 1);
        System.out.println("Element at index 1: " + list.get(1));
        list.add(32);
        System.out.println("Contains 30: " + list.contains(32));
        System.out.println("Removed element at index 2: " + list.remove(2));
        System.out.println("Updated size of the list: " + list.size());

    }
}
