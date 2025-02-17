package JavaCp.Java;

import java.util.ArrayList;
import java.util.List;

public class aback {
    
}class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] - nums[i] == 1) 
                i++;
            if (start != nums[i])  
                list.add("" + start + "->" + nums[i]); 
            else
                list.add("" + start);
        }

        return list;
    }
}
