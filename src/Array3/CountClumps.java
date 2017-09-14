/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
 */

package Array3;

public class CountClumps {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr1) + ", expected: 2");
        int[] arr2 = {1, 1, 2, 1, 1};
        System.out.println(countClumps(arr2) + ", expected: 2");
        int[] arr3 = {1, 1, 1, 1, 1};
        System.out.println(countClumps(arr3) + ", expected: 1");
        int[] arr4 = {1, 2, 3};
        System.out.println(countClumps(arr4) + ", expected: 0");
        int[] arr5 = {2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        System.out.println(countClumps(arr5) + ", expected: 4");
        int[] arr6 = {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        System.out.println(countClumps(arr6) + ", expected: 4");
        int[] arr7 = {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        System.out.println(countClumps(arr7) + ", expected: 5");
        int[] arr8 = {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};
        System.out.println(countClumps(arr8) + ", expected: 5");
        int[] arr9 = {};
        System.out.println(countClumps(arr9) + ", expected: 0");
    }

    private static int countClumps(int[] nums) {
        int count = 0;
        boolean wasClump;

        for (int i = 0; i < nums.length; i++) {
            wasClump = i - 1 >= 0 && nums[i - 1] == nums[i];
            if ((i + 1 == nums.length && wasClump) ||
                (i + 1 < nums.length && nums[i] != nums[i + 1] && wasClump)) {
                count++;
            }
        }

        return count;
    }
}
