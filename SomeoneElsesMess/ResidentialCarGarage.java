package SomeoneElsesMess;

public class ResidentialCarGarage extends templateHouse{

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
        System.out.printf("\nThis %s can accomodate %d %s.",
                this.getBuildingDescription(), this.cars, noun);
    
    }
}
