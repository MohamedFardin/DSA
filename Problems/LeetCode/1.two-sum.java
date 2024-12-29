/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Nive Solution: 
        // Check with everyother number for target
        final int lengthOfInputArray = nums.length;
        // Loop for first number
        for(int index1=0; index1<lengthOfInputArray; index1++) {
            int num1 = nums[index1];
            // Check with everyother element in the array
            for(int index2=0; index2<lengthOfInputArray; index2++) {
                // Same number can't be repeated to get the answer
                if(index1 == index2) {
                    continue;
                }
                // Check if 2 nums equal to target
                int num2 = nums[index2];
                if((num1 + num2) == target) {
                    int[] solution = {index1, index2};
                    return solution;
                }
            }
        }
        // Every test should contain a solution, so the else part is not handled.
        // If required we can have an optional output to handle this in real life scenarios
        throw new RuntimeException("A solution for each test is expected!");
    }
}
// @lc code=end

