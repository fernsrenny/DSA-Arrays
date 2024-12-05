/*
https://leetcode.com/problems/find-the-duplicate-number/

The code is solved using the Floyd's Tortoise and Hare (Cycle Detection) algorithm. This approach uses the fact that the numbers in the array represent a directed graph where each index points to another index (based on the value). The repeated number creates a cycle in this graph.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Step 2: Move tortoise (1 step) and hare (2 steps) to detect cycle
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Step 3: Find the starting point of the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        // Step 4: Return the duplicate number
        return hare;
    }
}
