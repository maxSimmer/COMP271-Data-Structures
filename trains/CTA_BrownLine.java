package trains;

public class CTA_BrownLine {

    public static void main(String[] args) {

        TrainLine brownLine = new TrainLine();
        brownLine.addStation("Kimball");
        brownLine.addStation("Francisco");
        brownLine.addStation("Rockwell");
        brownLine.addStation("Western");
        brownLine.addStation("Damen");
        brownLine.insertBefore("Francisco", "Kedzie");

        
        System.out.println(brownLine);
        //brownLine.delete("Kimball");
        brownLine.deleteDelete("Rockwell");
        System.out.println(brownLine.toString());

        /* 
        System.out.println(brownLine);
        brownLine.deleteDelete("Damen");
        System.out.println(brownLine.toString());
        */
    }

}