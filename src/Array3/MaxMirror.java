package Array3;

public class MaxMirror {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(maxMirror(arr1) + ", expected: 3");
        int[] arr2 = {1, 2, 1, 4};
        System.out.println(maxMirror(arr2) + ", expected: 3");
        int[] arr3 = {7, 1, 2, 9, 7, 2, 1};
        System.out.println(maxMirror(arr3) + ", expected: 2");
        int[] arr4 = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
        System.out.println(maxMirror(arr4) + ", expected: 4");
        int[] arr5 = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        System.out.println(maxMirror(arr5) + ", expected: 4");
        int[] arr6 = {1, 2, 3, 2, 1};
        System.out.println(maxMirror(arr6) + ", expected: 5");
        int[] arr7 = {1, 2, 3, 3, 8};
        System.out.println(maxMirror(arr7) + ", expected: 2");
        int[] arr8 = {1, 2, 7, 8, 1, 7, 2};
        System.out.println(maxMirror(arr8) + ", expected: 2");
        int[] arr9 = {1, 1, 1};
        System.out.println(maxMirror(arr9) + ", expected: 3");
        int[] arr10 = {1};
        System.out.println(maxMirror(arr10) + ", expected: 1");
        int[] arr11 = {};
        System.out.println(maxMirror(arr11) + ", expected: 0");
        int[] arr12 = {9, 1, 1, 4, 2, 1, 1, 1};
        System.out.println(maxMirror(arr12) + ", expected: 3");
        int[] arr13 = {5, 9, 9, 4, 5, 4, 9, 9, 2};
        System.out.println(maxMirror(arr13) + ", expected: 7");
        int[] arr14 = {5, 9, 9, 6, 5, 4, 9, 9, 2};
        System.out.println(maxMirror(arr14) + ", expected: 2");
        int[] arr15 = {5, 9, 1, 6, 5, 4, 1, 9, 5};
        System.out.println(maxMirror(arr15) + ", expected: 3");
    }

    private static int maxMirror(int[] nums) {
        int maxMir = 0;
        for (int i = 0; i < nums.length; ) {
            int mir = 0;
            for (int j = nums.length - 1; j >= i; ) {
                if (nums[i + mir] == nums[j]) {
                    mir++;
                    j--;
                } else if (nums[i + mir] != nums[j] && mir != 0){
                    maxMir = (maxMir < mir) ? mir : maxMir;
                    mir = 0;
                    j--;
                } else {
                    j--;
                }
            }
            maxMir = (maxMir < mir) ? mir : maxMir; // if we reached the first element on the left with mir != 0 up to this moment
            i += mir;
        }
        return maxMir;
    }
}
