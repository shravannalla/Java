/*Time complexity of this code is O(n) where n is the size of string*/

package Assignment02;
import java.util.Scanner;

public class ContainsAllOrNot {
    public static boolean isContainsAll(char[] inputString){
        int noOfDistinctAlphabets=0;
        int[] alphabet = new int[26];
        for (char c : inputString) {
            int charInAlphabet = c - 'a';
            if (charInAlphabet >= 0 && charInAlphabet <= 25)
                alphabet[charInAlphabet] = 1;

        }

        for(int i : alphabet){
            noOfDistinctAlphabets+= i;
        }
        return noOfDistinctAlphabets == 26;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine().toLowerCase();
        char[] inputString=input.toCharArray();

        if(isContainsAll(inputString))
            System.out.println("The String contains all the letters of alphabet");
        else
            System.out.println("The String doesn't contain all the letters of alphabet");
    }

}
