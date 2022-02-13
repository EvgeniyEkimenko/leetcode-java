package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] test = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(new TwoSum().twoSum(test, 6)));

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) return new int[]{map.get(res), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
