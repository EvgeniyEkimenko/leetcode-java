package strings;


public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(new ImplementStrStr().strStr("eewsfeer", "eer"));
    }

    public int strStr(String haystack, String needle) {

        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        int needleLength = needle.length();
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
