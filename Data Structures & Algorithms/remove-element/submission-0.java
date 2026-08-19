class Solution {
    public int removeElement(int[] nums, int val) {
        int p = nums.length - 1;
        for(int i = p; i >= 0; i--){
            if(nums[i] == val){
                swap(nums, i, p);
                --p;
            }
        }
        return ++p;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}