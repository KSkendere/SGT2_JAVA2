package lesson4;

import java.sql.Array;
import java.util.TreeSet;

public class MaxNumber2<maximumToReturn> {
    public static void main(String[] args) {

        int[]nums = {5,6,7,8};
        System.out.println(returnThirdDistinctMaximumOrMaximum(nums));
    }

    /**
     * Method to return third distinct maximum from array nums, if there is no third distinct maximum, maximum is returned
     * @param nums
     * @return maximumToReturn
     */

    public static int returnThirdDistinctMaximumOrMaximum(int[]nums) {
//convert array into tree set to sort numbers from smaller to bigger and get rid of duplicates
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            myTreeSet.add(nums[i]);
        }
//converting tree set back to array to be able to access indexes
       Object[] arr = myTreeSet.toArray();
        int maximumToReturn;
//setting conditions for result which has to be returned
        if (arr.length < 3) {
            maximumToReturn = (int) arr[+arr.length - 1];
        } else {
            maximumToReturn = (int) arr[arr.length - 3];
        }
    return maximumToReturn;
}
}
