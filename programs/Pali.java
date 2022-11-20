public class Pali{
    /*
     Specs: Case Insensitive,
        Letters only -- ignore everything else

        Workflow: given a string s:
        - convert to lowercase
        - remove everything but letter characters
        - while loop from both ends of string, ends when pair not the same
     */
    /**
     * Convert a string to lower case and remove all nonletter characters.
     * 
     * @param s String to convert
     * @return a string with only the letter charchters of s in lowercase
     */

     public static String lettersOnly(String s){
      String result = "";
      // make lowercase
      String sLowercase = s.toLowerCase();
      // loop to remove non letters using ASCII
      for (int i = 0; i < sLowercase.length(); i++){
         if (sLowercase.charAt(i) > 96 && sLowercase.charAt(i) < 123)
            result = result + sLowercase.charAt(i);
      } // end for loop
      return result;

     } // method lettersOnly

     public static boolean isPalindrome(String s){
      String stringToProcess = lettersOnly(s);
      boolean result = true;
      int index = 0;

      while(result && index < (stringToProcess.length())/2){
         if(stringToProcess.charAt(index) != stringToProcess.charAt(s.length()-1-1))
            result = false;
         index++;
         
      }
      return result;
     } // method isPalindrone
     public static void main(String[] args){
      System.out.println(lettersOnly("leo127!"));
      System.out.println(isPalindrome("wow"));
     }

}