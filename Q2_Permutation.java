import java.util.*;

public class Q2_Permutation {

    public static void main(String args[]) {
        System.out.println(permutation("Hi", "iH"));
    
        System.out.println(permutation2("Dominick", "kcinimoD"));
    }

    
    public static boolean permutation2(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] letters = new int[128];

        for(int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;

            if(letters[t.charAt(i)] < 0)
                return false;
        }

        return true;
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
