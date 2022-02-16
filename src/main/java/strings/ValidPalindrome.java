package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch>96 && ch<123) || (ch>47 && ch<58)) sb.append(ch);
        }

        int size = sb.length()-sb.length()/2;
        for (int i = 0; i <size; i++) {
            if (sb.charAt(i)!=sb.charAt(sb.length()-1-i)) return false;
        }

        return true;
    }
}
