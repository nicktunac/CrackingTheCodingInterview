
/**
 * Question:
 * Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the "true" length of the string.
 */
public class Q3_URLify {

    public static void main(String args[]) {
        System.out.println(URLify("Mr John Smith    ".toCharArray(), 13));
    }

    public static String URLify(char[] str, int trueLength) {        
        int spaceCount = 0, i = 0, index;
        for(i = 0; i < trueLength; i++) {
            if (str[i] == ' '){
                spaceCount++;
            }   
        }

        index = trueLength + spaceCount * 2;

        if (trueLength < str.length) str[trueLength] = '\0'; // End array

        for(i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        return new String(str);

    }

}