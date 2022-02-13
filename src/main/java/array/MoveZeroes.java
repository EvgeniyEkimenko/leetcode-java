package array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] test = new int[]{0, 1, 0, 3, 12};
        int[] test2 = new int[]{1, 0, 1};
        new MoveZeroes().moveZeroes(test2);
    }

    public void moveZeroes(int[] nums) {

        int nzPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (nums[nzPointer] == 0 && nzPointer != i) {
                    int temp = nums[nzPointer];
                    nums[nzPointer] = nums[i];
                    nums[i] = temp;
                    nzPointer++;
                } else nzPointer++;
            }
        }
    }
}
