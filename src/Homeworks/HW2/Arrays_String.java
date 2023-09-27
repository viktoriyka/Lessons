package Homeworks.HW2;

public class Arrays_String {
    public static void main(String[] args) {
        String str1 = "Hello world!";

        System.out.println("First:" + str1.charAt(0) +"\nLast:" + str1.charAt(str1.length() - 1));

        char[] strArray = str1.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
            System.out.println(strArray[strArray.length - 2]);

    }
}
