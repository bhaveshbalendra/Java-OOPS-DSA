/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int idx = 0;
        int i = 0;
        int res = 0;
        while (temp > 0) {
            i++;
            int digit = temp % 10;
            temp = temp / 10;
            if (digit == 6) idx =i;
        }
        return res;
    }
}
// @lc code=end

