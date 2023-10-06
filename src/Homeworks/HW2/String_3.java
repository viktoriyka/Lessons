package Homeworks.HW2;

public class String_3 {
    public static void main(String[] args) {

        String str = "Я хочу пенесення рядків";
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
