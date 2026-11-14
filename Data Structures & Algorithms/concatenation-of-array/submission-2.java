class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] a = new int [nums.length * 2];
        // int n = nums.length;
        // int i = 0;

        // while (i < n) {
        //     a[i] = nums[i];
        //     i++;
        // }
        // int j = 0;
        // while (j < n) {
        //     a[i] = nums[j];
        //     i++;
        //     j++;
        // }
        // return a;
        int n = nums.length;
        int [] A = new int[2 * n];

        for (int i = 0; i < n; i++) {
            A[i] = A[i + n] = nums[i];
        }

        return A;
    }
}