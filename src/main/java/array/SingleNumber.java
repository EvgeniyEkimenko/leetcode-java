package array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

        int[] array = {1};
        System.out.println(new SingleNumber().singleNumber(array));

    }

    //new solution
    public int singleNumber(int[] nums) {

        int res = 0;
        for (int i=0;i<nums.length;i++) {
            res=res^nums[i];
        }
        return res;
    }



}
