package databaseApplication;

public class Violation {
    protected int violatedCode;
    protected String violationDescription;
    protected double fine;

    public Violation(int violatedCode, String violationDescription){
        this.violatedCode = violatedCode;
        this.violationDescription = violationDescription;
    }

    public String toString(){
        return String.format("%d, %s", this.violatedCode, this.violationDescription);
    }
}
