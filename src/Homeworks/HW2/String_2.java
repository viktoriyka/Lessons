package Homeworks.HW2;

public class String_2 {
    public static void main(String[] args) {
        String str = "Мама мила раму";
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}