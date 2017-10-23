/**
 * Question: Palindrome Permutation
 * 
 * Given a string, write a function to check if it is a permutation of a plaindrome. A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearragement of letters. The palindrome does not need to be limited to just dictionary words.
 * 
 * Example
 * 
 * Input:   Tact Coa
 * Output:  True (permutations: "taco cat", "acto cta", etc.)
 */

 class Q4_PalindromePermutation {

    public static void main(String args[]) {
        System.out.println(isPermutationOfAPalindrome("Tact Coazz".toLowerCase()));
    }

    public static boolean isPermutationOfAPalindrome(String s) {
        int[] intTable = new int[128];

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;
            
            intTable[s.charAt(i)]++;
        }

        boolean isPermutation = false;
        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;

            
            if(intTable[s.charAt(i)] % 2 == 1 && intTable[s.charAt(i)] <= 2) {
                if(isPermutation) {
                    return false;
                }
                isPermutation = true;
            }
            System.out.println("" + s.charAt(i) + ": " + intTable[s.charAt(i)]);
        }

        return true;
    }

    public static boolean isPalindrome(char[] c) {
        if(c.length < 2) return false;

        for(int i = 0, j = c.length - 1; i < c.length/2; i++, j--) {
            if(c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }

 }