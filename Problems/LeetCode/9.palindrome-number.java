/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int number) {
        // Naive approach:
        // Get the reverse of  the number and check palindrome
        // If the number is -ve, it can't be palindrom
        if(number < 0) {
            return false;
        }
        // If the number is 1 digit, it is palindrom
        if(number < 10) {
            return true;
        }
        // Get the reverse of the number
        int reversedNumber = reverse(number);
        // Check if the number and reversed number are equal
        return number == reversedNumber;
    }

    // Get Reverse of input number
    private int reverse(int number) {
        int reversedNumber = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    /*
     * Other approaches:
     * 1. Reverse only half of the number and compare with the other half
     * 2. Convert the number to string and perform the validation on the string
     */
}
// @lc code=end

