public class City extends Place implements Local, Statistical, Transportation {

    // Populate this class with the fields and the methods necessary to
    // fulfill the implemented interfaces.

    /**
     * Created methods for each of the characteristics and fields from other files
     * Not entirely sure if we need to write a main method?
     */
    
    // initalize variables from other files
    private String name;
    private String climate;
    private int population;
    private boolean hasAirport;
    private String nameOfAirport;
    public boolean hasHarbor;
    private String nameOfHarbor;
    private boolean hasTrainStation;
    private String nameOfTrainStation;
    private boolean hasBusService;
    private boolean hasSubwayNetwork;

    // method describeClimate from Local.java
    public String describeClimate() {
        // print the climate
        System.out.println("The climate of the city " + name + " is " + climate + ".");
        return climate;
    } // method describeClimate

    // method population from Statistical.java
    public int population() {
        // print the population
        System.out.println("The population of the city " + name + " is " + population + ", as of 2022.");
        return population;
    } // method population

    /**
    public boolean hasAirport();
    public String nameOfAirport();

    public boolean hasHarbor();
    public String nameOfHarbor();

    public boolean hasTrainStation();
    public String nameOfTrainStation();

    public boolean hasBusService();
    public boolean hasSubwayNetwork();
     */

     // airports
     // method hasAirport returns true or false depending if there is an airport
    public boolean hasAirport() {
        // if no harbor
        if (!hasAirport)
            System.out.println("There is no airport within " + name + ".");
        // else there is a harbor
        else
            System.out.println(name + " has an airport!");
        return hasAirport;
    } // method hasAirport

    // if there is an airport, print the name
    public String nameOfAirport() {
        // if no airport
        if (!hasAirport)
            System.out.println("There is no airport in" + name + ".");
        // else there is an airport
        else
            System.out.println("The name of the airport in " + name + " is " + nameOfAirport + ".");
        return nameOfAirport;
    } // method nameOfAirport

    // harbors
    // method hasHarbor determines if there is a harbor
    public boolean hasHarbor() {
        // no harbor
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        // else there is a harbor
        else
            System.out.println(name + " has a harbor!");
        return hasHarbor;
    } // method hasHarbor

    // if there is a harbor, give us the name
    public String nameOfHarbor() {
        // if no harbor
        if (!hasHarbor)
            System.out.println("There is no harbor in " + name + ".");
        // else print the name of the harbor
        else
            System.out.println("The name of the harbor in " + name + " is " + nameOfHarbor + ".");
        return nameOfHarbor;
    } // method nameOfHarbor

    // trainstations
    // method hasTrainstation tells if there is a train station or not
    public boolean hasTrainStation() {
        // if no trainstation
        if (!hasTrainStation)
            System.out.println("There is no train station in the town " + name + ".");
        // else there is a trainstation
        else
            System.out.println(name + " has a train station!");
        return hasTrainStation;
    } // method hasTrainStation

    // method nameOfTrainStation
    // tells us the name of the train station if there is one in the town
    public String nameOfTrainStation() {
        // if no trainstation
        if (!hasTrainStation)
            System.out.println("There is no train station in " + name + ".");
        // else print the name of the station within the city
        else
            System.out.println("The name of the train station in " + name + " is " + nameOfTrainStation + ".");
        return nameOfTrainStation;
    } // method nameOfTrainStation

    // method hasBusService
    // tells us if we have a bus service or not
    public boolean hasBusService() {
        // if no bus
        if (!hasBusService)
            System.out.println("There is no bus service in " + name + ".");
        // else tell us if there is a bus service
        else
            System.out.println(name + " has a bus service!");
        return hasBusService;
    } // method hasBusService

    // method for subways
    // lets us know if there is a subway or not
    public boolean hasSubwayNetwork() {
        // if no subway
        if (!hasSubwayNetwork)
            System.out.println("There is no subway network in " + name + ".");
        // else there is a subway
        else
            System.out.println(name + " has a subway network!");
        return hasSubwayNetwork;
    } // method hasSubwayNetwork


}  // class City
