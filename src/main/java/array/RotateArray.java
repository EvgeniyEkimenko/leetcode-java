package array;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2}; //test input
        new RotateArray().rotate(nums, 3);
    }

    public void rotate(int[] nums, int k) {

        int[] numTemp = new int[nums.length];
        int count = 0;
        int step = k % nums.length;

        System.out.print("[");
        for (int i = nums.length - step; i < nums.length; i++) {
            numTemp[count] = nums[i];
            count++;
        }
        for (int i = 0; i < nums.length - step; i++) {
            numTemp[count] = nums[i];
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numTemp[i];
        }
    }
}
