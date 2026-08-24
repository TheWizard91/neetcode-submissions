class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        // Outer loop picks each element one by one
        for (int i = 0; i < n; i++) {
            int maxRight = -1; // Default to -1 for the last element

            // Inner loop scans all remaining elements to the right
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > maxRight) {
                    maxRight = arr[j];
                }
            }

            // Replace the current element with the max found on its right
            arr[i] = maxRight;
        }

        return arr;
    }
}