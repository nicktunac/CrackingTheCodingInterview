
/**
 * Question:
 * 
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures
 */
class Q1_IsUnique {

    public static void main(String args[]) {
        System.out.println(isUnique("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"));
    }

    public static boolean isUnique(String s) {
        if (s.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        
        for(int i = 0; i < s.length(); i++) {
            
            int val = s.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

}