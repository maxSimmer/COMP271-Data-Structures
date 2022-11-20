package databaseApplication;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class FileIO {

    static class Driver {
        String driverLicense, firstName, lastName;
        public Driver (String driverLicense, String firstName, String lastName){
            this.driverLicense = driverLicense;
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(new File("driver.txt"));
        while(sc.hasNext()){
            String[] record = sc.nextLine().split(",");
            System.out.println(Arrays.toString(record));
            Driver driver = new Driver(record[2], record[0], record[1]);
        }
      
    }
}
