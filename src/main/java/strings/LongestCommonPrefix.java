package strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[]{"ab", "a"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        char ch = ' ';
        StringBuilder sb = new StringBuilder("");
        int j = 0;

        while (true) {
            if (j != strs[0].length()) ch = strs[0].charAt(j);
            for (String str : strs) {
                if (str.length() == j || str.length() == 0) return sb.toString();
                if (str.charAt(j) != ch) return sb.toString();
            }
            sb.append(ch);
            j++;
        }
    }
}
