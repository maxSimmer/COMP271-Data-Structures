import java.util.Scanner;
public class addTwo {
    public static void main(String[] args){
        // ask user for both numbers and store them in new STRING variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        String stringOne = input.next();
        System.out.println("Enter your second number: ");
        String stringTwo = input.next();
        // numbers are turned into STRING variables to avoid the integer limit

        // sum starts at 0
        int sum = 0;
        // change string variables  BACK into integers
        Integer numberOne = Integer.valueOf(stringOne);
        Integer numberTwo = Integer.valueOf(stringTwo);
        // add both integers
        sum = numberOne+numberTwo;

        System.out.print("The sum is: " + sum);
        input.close();


    }
    
}
