package Assignment12;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String  engDepartment;
    private int yearOfEnrollment;
    private double percentageTillDate;

    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double percentageTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.percentageTillDate=percentageTillDate;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getEngDepartment(){
        return engDepartment;
    }

    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }

    public double getPercentageTillDate(){
        return percentageTillDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartment + '\'' +
                ", yearOfEnrollment=" + yearOfEnrollment +
                ", percentageTillDate=" + percentageTillDate +
                '}';
    }


}
