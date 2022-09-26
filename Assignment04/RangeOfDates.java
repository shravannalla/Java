package Assignment04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class RangeOfDates{
    private static final Scanner scan = new Scanner(System.in);

    public static User getUserDates(){
        return new User(scan.next(),scan.next());
    }
    public static void getKycDateRange(User user)throws ParseException{
        SimpleDateFormat requiredType = new SimpleDateFormat("dd-MM-yyy");
        Date signupDate = new SimpleDateFormat("dd-MM-yyyy").parse(user.getSignupDate());
        Date currentDate= new SimpleDateFormat("dd-MM-yyyy").parse(user.getCurrentDate());
        if(currentDate.compareTo(signupDate)>0){

            Date kycStartDate;
            Date kycEndDate;

            Calendar signUpCalendar = Calendar.getInstance();
            Calendar currentDateCalendar = Calendar.getInstance();

            signUpCalendar.setTime(signupDate);
            currentDateCalendar.setTime(currentDate);

            signUpCalendar.set(Calendar.YEAR,currentDateCalendar.get(Calendar.YEAR));
            signUpCalendar.add(Calendar.DATE,30);
            kycEndDate = signUpCalendar.getTime();
            signUpCalendar.add(Calendar.DATE,-60);
            kycStartDate = signUpCalendar.getTime();
            if(kycStartDate.compareTo(currentDate)>0){
                System.out.println("No Range");
                return ;
            }
            if(kycEndDate.compareTo(currentDate)>0){
                kycEndDate = currentDate;
            }
            System.out.println(requiredType.format(kycStartDate)+" "+ requiredType.format(kycEndDate));
        }
        else{
            System.out.println("No Range");
        }
    }

    public static void main(String[] args) throws ParseException {
        int numberOfInputs;
        numberOfInputs = scan.nextInt();
        List<User> dates = new ArrayList<>(numberOfInputs);
        for(int i=0;i<numberOfInputs;i++) {
            dates.add(getUserDates());
        }
        for (User user:dates) {
            getKycDateRange(user);
        }
    }
}
