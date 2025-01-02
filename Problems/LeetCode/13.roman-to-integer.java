
import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String romanNumber) {
        // Naive Approach:
        // Read the string from left to right and keep adding the value,
        //  if the current value is less than the next value, then subtract the current value.
        Integer integerValue = 0;

        // Roman Characters: I, V, X, L, C, D, M
        Map<String, Integer> romanLettersMap = Map.of(
            "I", 1, 
            "V", 5, 
            "X", 10, 
            "L", 50, 
            "C", 100, 
            "D", 500, 
            "M", 1000);

        // Iterate  over the roman number and calculater the integer value
        int lengthOfRomanNumber = romanNumber.length();
        for(int i=0; i<lengthOfRomanNumber-1; i++) {
            String currentRomanLetter = romanNumber.substring(i, i+1);
            String nextRomanLetter = romanNumber.substring(i+1, i+2);
            // If the current value is less than the next value, then it is an exception like the number "9" -> "IX"
            if(romanLettersMap.get(currentRomanLetter) >= romanLettersMap.get(nextRomanLetter)) {
                integerValue += romanLettersMap.get(currentRomanLetter);
            } else {
                integerValue -= romanLettersMap.get(currentRomanLetter);
            }
        }
        // Add the last roman number
        integerValue += romanLettersMap.get(romanNumber.substring(lengthOfRomanNumber-1));
        return integerValue;
    }
}
// @lc code=end

