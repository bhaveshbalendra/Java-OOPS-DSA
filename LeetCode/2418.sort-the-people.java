/*
 * @lc app=leetcode id=2418 lang=java
 *
 * [2418] Sort the People
 */

// @lc code=start
import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);

        int index = 0;
        for (int i = heights.length-1; i>=0; i--) {
            result[index] = map.get(heights[i]);
            index ++;
        }
        return result;
    }
}
// @lc code=end

