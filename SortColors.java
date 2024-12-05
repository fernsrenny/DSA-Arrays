/*
https://leetcode.com/problems/sort-colors/

This problem is solved using the Dutch National Flag algorithm (or a three-pointer approach). The idea is to maintain three regions in the array for each color (0, 1, and 2) and rearrange the elements in a single traversal.
*/

class SortColors {
    public void sortColors(int[] nums) {
        // Initialize pointers
        int low = 0;         // Tracks the position for 0
        int mid = 0;         // Tracks the current element
        int high = nums.length - 1; // Tracks the position for 2

        // Traverse the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] with nums[low] and increment low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid to the next element
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] with nums[high] and decrement high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
