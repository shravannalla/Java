import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList;
        circleList=new ArrayList<>();
        fillArrayList(circleList);
        printCircles(circleList);

    }
    private static void fillArrayList(ArrayList<Circle> circleAL){
        Scanner infile;
        try{
            infile=new Scanner(new File("circle_data.txt"));
            Circle temp;
            double radius;
            while(infile.hasNext()){
                radius=infile.nextDouble();
                temp=new Circle(radius);
                circleAL.add(temp);
            }
            infile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Error accessing file..!");
        }
    }
    private static void printCircles(ArrayList<Circle> circleAL){
        PrintWriter pw;
        try{
            pw=new PrintWriter("circles_output.txt");
            for(Circle c: circleAL){
                System.out.println("Radius: "+c.getRadius());
                System.out.println("Circumference: "+c.circumference());
                System.out.println("Area: "+c.area());
                System.out.println();
                pw.println("Radius: "+c.getRadius());
                pw.println("Circumference: "+c.circumference());
                pw.println("Area: "+c.area());
                pw.println();
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't access file..!");
        }
    }
}
