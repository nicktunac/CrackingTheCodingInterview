import java.util.*;

public class Q2_Permutation {

    public static void main(String args[]) {
        System.out.println(permutation("Hi", "iH"));
        System.out.println(permutation("Hello", "Hlleo"));
    }

    public static boolean permutation(String string1, String string2) {

        if(string1.length() != string2.length()) return false;

        return sort(string1).equals(sort(string2));
    }

    public static String sort(String stringValue) {

        char[] charArray = stringValue.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
