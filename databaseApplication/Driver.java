package databaseApplication;

public class Driver {

    protected String driverLicenseNumber;
    protected String firstName;
    protected String lastName;

    public Driver (String driverLicense, String firstName, String lastName){
        this.driverLicenseNumber = driverLicense;
        this.firstName = firstName;
        this.lastName = lastName;   
    }

    public String toString(){
        return String.format("%s, %s, %s", this.driverLicenseNumber, this.firstName, this.lastName);
    }
    

    
}
