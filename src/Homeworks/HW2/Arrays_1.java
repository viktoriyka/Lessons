package Homeworks.HW2;

public class Arrays_1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 4;
        nums[3] = 2;
        nums[4] = 1;
        nums[5] = 4;
        nums[6] = 3;
        nums[7] = 9;
        nums[8] = 7;
        nums[9] = 2;

        float[] numbers = new float[]{3.43f, 12.1212f, 12.22f, 2.29f};

        int[][] nums11 = {{0, 1, 2}, {3, 4, 5}};

        for (int i = 0; i <= nums11.length; i++) {
            for (int j = 0; j <= nums11.length; j++)
            System.out.print(nums11[i][j] + " ");
            System.out.println ();
        }
    }
}