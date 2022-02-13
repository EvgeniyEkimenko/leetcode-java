package array;

public class ReverseString {

    public static void main(String[] args) {
        String teststr = "Hannah";
        char[] test = teststr.toCharArray();
        new ReverseString().reverseString(test);

    }

    public void reverseString(char[] s) {
        int size = s.length / 2;
        int fullSize = s.length;
        for (int i = 0; i < size; i++) {
            char temp = s[i];
            int sizeBuf = fullSize - 1 - i;
            s[i] = s[fullSize - 1 - i];
            s[sizeBuf] = temp;
        }
    }

}
