package lesson4;

import java.lang.reflect.Array;

public class MaxNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5,2,5,6,2,4};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums.length <= 1 || nums.length >= Math.pow(10, 4)) {
                System.out.println("Array is not correct");
                break;
            }
            if (nums[i] <= Math.pow(-2, 31) || nums[i] >= Math.pow(2, 31) - 1) {
                System.out.println("Number is not correct");
                break;
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++) {

            if (nums.length <= 1 || nums.length >= Math.pow(10, 4)) {
                System.out.println("Array is not correct");
                break;
            }

            if (nums[j] <= Math.pow(-2, 31) || nums[j] >= Math.pow(2, 31) - 1) {
                System.out.println("Number is not correct");
                break;
            }

            if (max2 < nums[j] && nums[j] != max) {
                max2 = nums[j];
            }
        }

        for (int n = 0; n < nums.length; n++) {

            if (nums.length <= 1 || nums.length >= Math.pow(10, 4)) {
                System.out.println("Array is not correct");
                break;
            }
            if (nums[n] <= Math.pow(-2, 31) || nums[n] >= Math.pow(2, 31) - 1) {
                System.out.println("Number is not correct");
                break;
            }
            if (max3 < nums[n] && nums[n] != max && nums[n] != max2) {
                max3 = nums[n];
            }
        }

        if (nums.length < 3 && nums.length > 1) {
            System.out.println("The largest number is " + max);
        } else if (nums.length > 3 && nums.length < 1) {
            System.out.println("The third distinct maximum is " + max3);
        } else {

            System.out.println("The third distinct maximum is " + max3);
        }
    }
}





