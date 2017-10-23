import java.util.*;

/**
 * Question: One Away
 * There are three types of edits that can be performed on strings: 
 *      insert a character,
 *      remove a character,
 *      or replace a character.
 * 
 * Given two strings, write a functiiion to check if they are one edit (or zero edits) away.
 * 
 * Example
 * 
 * palem ple    -> true
 * pales, pale  -> true
 * pale, bale   -> true
 * pale, bae    -> false
 */

public class Q5_OneWay {
    public static void main(String args[]) {

        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));
    }

    static boolean oneAway(String s, String t) {

        // Assumed that s is full string
        // and t is the condition string

        int sLength = s.length();
        int tLength = t.length();
        
        if(Math.abs(sLength - tLength) > 1) 
            return false;

        // Insert a character
        Map<Character, Boolean> map = new HashMap<>();

        for(int i = 0; i < sLength; i++) {
            map.put(s.charAt(i), false);
        }

        int count = 0;
        for(int i = 0; i < tLength; i++) {
            if(map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), true);
                count++;
            }
        }

        if(sLength - 1 == count) {
            return true;
        }

        return false;
    }

}