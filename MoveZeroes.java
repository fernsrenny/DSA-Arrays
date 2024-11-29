/*
https://leetcode.com/problems/move-zeroes/
*/

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroPos = 0;
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[current];
                nums[current] = nums[lastNonZeroPos];
                nums[lastNonZeroPos] = temp;       
                lastNonZeroPos++;
            }
        }
    }
}
