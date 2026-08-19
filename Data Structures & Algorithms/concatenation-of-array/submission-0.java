class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int [nums.length * 2];
        int n = nums.length;
        int i = 0;

        while (i < n) {
            a[i] = nums[i];
            i++;
        }
        int j = 0;
        while (j < n) {
            a[i] = nums[j];
            i++;
            j++;
        }
        return a;
    }
}