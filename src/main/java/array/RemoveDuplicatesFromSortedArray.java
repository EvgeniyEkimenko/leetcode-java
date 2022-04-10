package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array

        int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);


    }

    //first solution 11.2.22
    public int removeDuplicates(int[] nums) {

        int sourcePointer = 1;
        int uniqueElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > uniqueElement) {
                uniqueElement = nums[i];
                nums[sourcePointer] = nums[i];
                sourcePointer++;
            }
        }
        return sourcePointer;
    }


    //second solution 10.4.22
    public int removeDuplicates2(int[] nums) {
        if (nums.length==1) return 1;

        int j = 1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]!=nums[i-1]) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
