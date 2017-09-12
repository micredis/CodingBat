package Array3;

public class MaxMirror {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(maxMirror(arr1) + ", expected: 3");
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
