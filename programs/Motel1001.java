public class Motel1001 {
    // motel capacity
    static int CAPACITY = 4;
    // guest registry
    static String guests[] = new String[CAPACITY];
    // count of occupied rooms
    static int COUNT = 0;
    /**
     * Process for guest arrival:
     * if count < capacity:
     *  accept guess
     *  count++
     * 
     */
    public static void arrival(String name){
        if (COUNT < CAPACITY){
            System.out.println("Welcome to motel java"+name+"!");
            guests[COUNT] = name;
            COUNT++;
        } else { 
            System.out.println("We r full" +name);
        }
    }
     /**
      * process for guest departure
        if count > 0
            remove guest
            count -- 
      */
      public static void departure(){
        if (COUNT > 0){
            System.out.println("Ty come again" + guests[COUNT-1]);
            guests[COUNT-1] = null;
            COUNT--;
        }
      }
      /**
       * Show hotel registry
       * @param args
       */
      public static void showHotelRegistry(){
        for (int i = 0; i < guests.length; i++){
            System.out.printf("\nRoom [%d]'s guest is %s", i,guests[i]);
        }
      }

      public static void main(String[] args){
        arrival("Lean"); arrival("Zara"); arrival("Chris"); arrival("Max");
        arrival("Jack");
        departure();
        arrival("Jim");
        showHotelRegistry();
      }
}
