package Assignment01;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

class FilePath{

    private static List<String> fileList;

    private static  File rootDirectory;
    public static boolean hasMatching(String pattern){
        Pattern p= Pattern.compile("[^\\s]*" +pattern+ "[^\\s]*", Pattern.CASE_INSENSITIVE);
        for(String name: fileList){
            if(p.matcher(name).matches()){
                return true;
            }
        }
        return false;
    }
    public static void printMatchedFiles(String pattern){
        Pattern p= Pattern.compile("[^\\s]*" +pattern+ "[^\\s]*", Pattern.CASE_INSENSITIVE);
        for(String name:fileList){
            if(p.matcher(name).matches()){
                System.out.println(name);
                System.out.println("Path: "+rootDirectory.getAbsolutePath()+"/"+name);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        rootDirectory=new File("/home/shraN");
        fileList=List.of(rootDirectory.list());
        String pattern;
        while(true){
            System.out.println("Enter the patter: ");
            pattern=scan.nextLine();
            if(pattern.equals("-1")){
                break;
            }
            else{
                pattern.toLowerCase();
                if(hasMatching(pattern)){
                    System.out.println("Files with entered pattern are: ");
                    printMatchedFiles(pattern);
                }
                else{
                    System.out.println("File not found..!");
                }


            }
        }

    }
}
