/* The question is as follows
https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

User function Template for Java
Use the class name correctly according to the question given
*/

class Chocolate_Distribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // If there are fewer packets than students, return -1
        if (m > arr.size()) return -1;

        // Sort the ArrayList
        Collections.sort(arr);

        // Initialize the minimum difference as a large value
        int minDifference = Integer.MAX_VALUE;

        // Use sliding window of size m
        for (int i = 0; i + m - 1 < arr.size(); i++) {
            // Calculate the difference between max and min in the current window
            int difference = arr.get(i + m - 1) - arr.get(i);
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }
}
