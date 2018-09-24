package com.ayalamih.hellobase;

/**
 * @author ayalamih
 */
public class App {

    public static void main(String[] args) {
        int j = 9;
        int m = j--;
        System.out.println(m);

        int i = 9;
        int n = --i;
        System.out.println(n);

        int[] nums = new int[]{1, 5, 9, 43, 90, 4, 5, 6};
        int target = 10;
        int[] result = getTwo(nums, target);
        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
    }

    private static int[] getTwo(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            for (int j = nums.length - 1; j > 0; j--) {
                int b = nums[j];

                if (a + b == target) {
                    result = new int[]{i, j};
                }
            }
        }

        return result;
    }
}
