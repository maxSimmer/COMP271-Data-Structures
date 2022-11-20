package SomeoneElsesMess;
public class templateHouse {

    /** Description of the building */
    public String buildingDescription;

    /** Number of floors or levels */
    private int floors;

    /** Type of roof material */
    private String roofMaterial;

    /** Roof design */
    private String roofDesign;

    /** Entrance shape */
    private String entranceShape;

    /** Entrance material */
    private String entranceMaterial;

    // constructor
    public templateHouse(String buildingDescripition){
        this.buildingDescription = buildingDescripition;
    }

    //Accessor for this.buildingDescription
    public String getBuildingDescription(){
        return this.buildingDescription;
        
    }

     /**
     * Description of roof
     */
    public void roof() {
        System.out.printf("\nThis %s has a %s roof made of %s.",
                this.buildingDescription, this.roofDesign, this.roofMaterial);
    }

    /**
     * Description of entrance
     */
    public void entrance() {
        System.out.printf("\nThis %s has a %s style entrance made of %s",
                this.buildingDescription, this.entranceShape, this.entranceMaterial);
    }


    
}
