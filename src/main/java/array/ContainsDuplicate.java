package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() != nums.length) return true;
        else return false;
    }
}
