package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array

        int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);


    }

    public int removeDuplicates(int[] nums) {

        int sourcePointer = 1;
        int uniqueElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > uniqueElement) {
                uniqueElement=nums[i];
                nums[sourcePointer] = nums[i];
                sourcePointer++;
            }
        }
        return sourcePointer;
    }
}
