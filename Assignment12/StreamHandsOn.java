package Assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamHandsOn {
    static List<Student> studentList;
    static void printAllDepartmentNames(){
        System.out.println("1. Department names:");
        studentList.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    static void studentsEnrolledAfter2018(){
        System.out.println("2. Names of students enrolled after 2018:");
        studentList.stream().filter(Student->Student.getYearOfEnrollment()>2018).map(Student::getName).forEach(System.out::println);
    }

    static void computerScienceMales(){
        System.out.println("3. Details of Male students in Computer Science:");
        studentList.stream().filter(Student->Student.getGender().equals("Male")).filter(Student->Student.getEngDepartment().equals("Computer Science")).forEach(System.out::println);
    }

    static void countMaleFemale(){
        System.out.println("4. Total number of males and females respectively are:");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }

    static void averageAgeOfMaleAndFemale(){
        System.out.println("5. Average age of male and female:");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));
    }

    static void topper(){
        System.out.println("6. Details of highest student having highest percentage:");
        var topper = studentList.stream()
                .max(Comparator.comparing(Student::getPercentageTillDate))
                .orElse(studentList.get(0));
        System.out.println(topper);
    }

    static void numStudentsInEachDep(){
        System.out.println("7. Number of students in each department:");
        System.out.println(studentList.stream().collect(Collectors
                .groupingBy(Student::getEngDepartment,Collectors.counting())));
    }

    static void avgPerInEachDepartment(){
        System.out.println("8. Average percentage in each department:");
        System.out.println(studentList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPercentageTillDate)))
        );
    }

    static void youngMaleInElectronics(){
        System.out.println("9. Details of youngest male in Electronics department:");
        Predicate<Student> isMale = s->s.getGender().compareToIgnoreCase("male")==0
                && s.getEngDepartment().compareToIgnoreCase("Electronic")==0;
        System.out.println(studentList.stream().filter(isMale).min(Comparator.comparing(Student::getAge)).orElse(null));
    }

    static void maleAndFemaleCS(){
        System.out.println("10. Number of male and female students in CS respectively:");
        Predicate<Student> isCS = s-> s.getEngDepartment().compareToIgnoreCase("Computer Science")==0;
        System.out.println(studentList.stream().filter(isCS).collect(Collectors
                .groupingBy(Student::getGender,Collectors.counting())));
    }


    public static void main(String[] args) {
        studentList=StudentsList.getAll();
        printAllDepartmentNames();
        studentsEnrolledAfter2018();
        computerScienceMales();
        countMaleFemale();
        averageAgeOfMaleAndFemale();
        topper();
        numStudentsInEachDep();
        avgPerInEachDepartment();
        youngMaleInElectronics();
        maleAndFemaleCS();
    }
}
