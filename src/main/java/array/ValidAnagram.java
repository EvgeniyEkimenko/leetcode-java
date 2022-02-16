package array;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int index;
        for (int i = 0; i < s.length(); i++) {
            if ((index = t.indexOf(s.charAt(i))) != -1) {
                t = t.substring(0, index) + t.substring(index + 1);
            } else {
                return false;
            }
        }
        return t.length() == 0;
    }
}

/*

  Optimal solutions...

  public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        return Arrays.equals(firstString, secondString);
    }

*/
