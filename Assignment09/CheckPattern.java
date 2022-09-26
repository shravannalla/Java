package Assignment09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sentence;
        sentence=scan.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].*[.]$");
        Matcher m=pattern.matcher(sentence);
        boolean isMatching=m.matches();
        if(isMatching){
            System.out.println("The sentence is starting with Uppercase and ending with period");
        }
        else{
            System.out.println("The sentence is not starting with Uppercase and ending with period");
        }
    }
}
