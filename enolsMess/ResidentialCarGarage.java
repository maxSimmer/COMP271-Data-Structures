package enolsMess;

/**
 * Create compareTo method for parking garage and spaces
 * @param building
 * 
 * @return comparison result
 */

public class ResidentialCarGarage extends Building{

    /** Number of cars accommodated */
    private int cars;

    /** Default constructor */
    public ResidentialCarGarage() {
        super("garage");
    }

    /**
     * Describe car space
     */
    public void parking() {
        String noun = (this.cars > 1) ? "cars" : "car";
        System.out.printf("\nThis %s can accommodate %d %s.",
                this.buildingDescription, this.cars, noun);
    }

    /**
    * Create compareTo method for parking garage and spaces
    * returns true if # of cars is > # of garage spaces 
    * returns false if # of cars is < # of garage spaces
    * created as boolean first, then I realized it's supposed to be in integer values
    * changed to integer, 1 = "true", -1 = "false"
    * could have NO garage, so throw null exception if thats the case
    * @param building
    * 
    * @return comparison result
    */

    public int compareTo(ResidentialCarGarage garage) throws NullPointerException{
        //initalize comparison and set to 0 
        int compareTest = 0;
        // if loop to compare the # of cars to the # accomodated amount 
        if (this.cars>garage.cars){
            compareTest = 1;
        } else if (this.cars<garage.cars){
            compareTest = -1;
        }
        return compareTest;
    
     }
}
