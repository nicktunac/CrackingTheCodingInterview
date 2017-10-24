/**
 * Question: String Compression
 * 
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the 
 * original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters(a-z)
 */

 class Q6_StringCompression {

    public static void main(String args[]) {
        System.out.println(stringCompression("aabcccccaaa"));
        //System.out.println(stringCompression("aaa"));
    }

    static String stringCompression(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < s.length()) {            
            char currentChar = s.charAt(i);
            
            int counter = 1;
            for(i = i + 1; i < s.length(); i++) {
                char nextChar = s.charAt(i);
                if(currentChar == nextChar) {
                    counter++;
                    continue;
                } else {
                    break;
                }
            }

            sb.append(currentChar + "" + counter);
        }

        String result = sb.toString();

        return result.length() > s.length() ? s : result ;
    }
 }