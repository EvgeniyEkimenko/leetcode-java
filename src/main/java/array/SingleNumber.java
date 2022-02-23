package array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

        int[] array = {1};
        System.out.println(new SingleNumber().singleNumber(array));

    }

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> keyToFreq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!keyToFreq.containsKey(nums[i])) {
                keyToFreq.put(nums[i], 1);
            } else {
                keyToFreq.replace(nums[i], 1, 2);
            }
        }
        for (Map.Entry<Integer, Integer> entry : keyToFreq.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }

    /*
    //The best another solution

    class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;

        for(int num : nums){
            n = n^num;
        }

        return n;
    }
}*/

}
