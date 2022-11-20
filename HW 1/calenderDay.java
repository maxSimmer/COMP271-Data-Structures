import java.util.Scanner;
public class calenderDay{
// template
    public static void main (String[] args){
        userInput();
    }
    //method for user input
    public static void userInput(){
        try (// ask user for the date
        Scanner user = new Scanner(System.in)) {
            //ask for month
            System.out.println("What is the month?(1-12)"); 
            int month = user.nextInt();
            // ask for day
            System.out.println("What is the day? (1-31)"); 
            int day = user.nextInt();
            // ask for year
            System.out.println("What is the year? (XXXX)");
            int year = user.nextInt();

            if (month > 12 || month < 1 || day > 31 || day < 1) {
                throw new IllegalArgumentException("Month (1-12) Day (1-31");
        }
    }
}
    // method to figure out which day and month the user has given
    public static String dayMonthConversion(){
        // declare the month and day using other methods w user input
        int monthAndDay = monthAndDay(month, day, year);
        // declare the year month and day using other methods w user input
        monthAndDay += yearMonthAndDay(year);

        // modular division 
        if (monthAndDay % 7 == 1) {
            return "Monday";
        } else if (monthAndDay % 7 == 2) {
            return "Tuesday";
        } else if (monthAndDay % 7 == 3) {
            return "Wednesday";
        } else if (monthAndDay % 7 == 4) {
            return "Thursday";
        } else if (monthAndDay % 7 == 5) {
            return "Friday";
        } else if (monthAndDay % 7 == 6) {
            return "Saturday";
        } else { 
            return "Sunday";
        }
    }
    // method for month and day after user input
    public int monthAndDay(int month, int day, int year){
        // math conversion for months (1-12) and days (1-31)

    }
    // method for year month and day after user input
    public static void yearMonthAndDay(int year){
        // math conversion for the user given year start with 1601
        year = 1601;
        int day = 0;
        // year loop + include leap years
        
    }
}



