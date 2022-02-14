package array;

public class ReverseInteger {
    public static void main(String[] args) {
        int s = 0;
        String str = String.valueOf(s);

        System.out.println(new ReverseInteger().reverse(s));
    }

    public int reverse(int x) {
        char[] chArray = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean isZero = true;

        if (chArray.length==1 && chArray[0]=='0') return 0;

        if (chArray[0] == '-') sb.append('-');
        for (int i = chArray.length - 1; i >= 0; i--) {
            if (chArray[i] != '0') isZero = false;
            if (!isZero && chArray[i] != '-') {
                sb.append(chArray[i]);
            }
        }

        long res = Long.parseLong(sb.toString());
        if ((int)res!=res) return 0;
        return (int)res;
    }
}

/*
Optimal solution

* public int reverse(int x) {
        long sum = 0;

        while (x != 0) {
            sum = sum * 10 + x % 10;
            x = x / 10;

            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
        }

        return (int)sum;
    }
    * */
