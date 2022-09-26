/*Basically if we don't initialise instance and class variables they take default values from the compiler
  But local variables don't have default values like class variables, so using them without initrializing gives error
*/

package Assignment05.data;
public class FirstClass {
    int number;
    char name;

    public void printInstance(){
        System.out.println(number);
        System.out.println(name);
    }
    public void printThis(){
        int number1;
        int name1;
        //System.out.println(number1);
        //System.out.println(name1);
    }
}
