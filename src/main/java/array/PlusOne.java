package array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] testArray = new int[]{8,9,9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(testArray)));
    }

    public int[] plusOne(int[] digits) {

        for (Integer digit : digits) {
            if (digit != 9) {
                return incrementDigit(digits);
            }
        }

        int[] resArray = new int[digits.length + 1];

        resArray[0] = 1;
        for (int i = 1; i < resArray.length; i++) {
            resArray[i] = 0;
        }
        return resArray;
    }

    public int[] incrementDigit(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = ++digits[i];
                return digits;
            } else digits[i] = 0;
        }
        return digits;
    }
}


/*
  The optimal solution

* public int[] plusOne(int[] digits) {
        int N = digits.length-1;
        int carry=1;

        for(int i=N;i>=0;i--)
        {
            int temp=digits[i]+carry;
            digits[i] = temp%10;
            carry = temp/10;
        }

        if(carry==1)
        {
            int R[] = new int[N+2];
            for(int i=N;i>=0;i--)
            {
                R[N+1]=digits[N];
            }
            R[0]=1;
            return R;
        }
            return digits;
    }
* */