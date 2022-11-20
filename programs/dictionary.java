import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/*  the file runs but I can't seem to get a return or output of the dictionary, I believe I get stuck in a loop somewhere
 while checking for repetition within the readBook method. I tried debugging using System.out.println throughout the code
 but could not figure out the issue.
                                 */
public class dictionary {
    /**
     * Produces a Scanner connected to a text file accessible via the web.
     *
     * The method expects a link to a text file. When accessing material from
     * Project Gutenberg it is import to use the plain text version of a book.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @param link String with URL to text file.
     * @return a Scanner for the file or null if connection cannot be made.
     */
    public final static Scanner browseTextFile(final String link) {
        // Declare the return variable
        Scanner fileOnline;
        // Use try/catch to prevent the program from crashing.
        try {
            // Create a URL object from the link provided
            URL url = new URL(link);
            // Turn the URL into a Scanner
            fileOnline = new Scanner(url.openStream());
        } catch (IOException e) {
            // If something goes wrong, prepare to return null Scanner.
            fileOnline = null;
        }
        return fileOnline;
    }  // method browseTextFile

    /**
     * scan/read book method, create an array and scan the book to add each word. call other methods
     * to clear out puncutation and repeats
     * while sc.hasNext to make sure te file hasnt ended. String word = sc.next();
     * @param scanBook is a scanner connected to the html/text file with a tale of two cities
     * @return String array with all of the words
     */
    public static String[] readBook(Scanner scanBook){
        // create array to store our words (dictionary) (start higher since its the NEW array)
        String[] dictionary = new String[1]; // 0 kpet giving an error
        dictionary[0] = scanBook.next(); // start at index 0
        // while loop to iterate and make sure file hasnt ended
        while(scanBook.hasNext()){ // while file hasnt ended
            //System.out.println("1");
            //go over the array
            // was debugging and testing the code with System.out.println, this is where the code seems to stop working
            for(int x=1; x < dictionary.length; x++){
                // make sure to set word as the next so we do NOT read the same word 
                String word = scanBook.next();
                // scan array IF it already has the words
                if(arrayRepetition(dictionary, removeGrammar(word)) == false){
                    // if repetition is false, "upgrade" array to have more size
                    dictionary = addArray(dictionary, 1); // take old dictionary, move it to a new one and add 1 more index.

                } else {
                    dictionary[x] = removeGrammar(word); // if repetition is true, remove word.
                    x--; // if else then do not add the word
                }
            }
        }
        return dictionary; // dictionary does not seem to return or produce any output
    }

    /**
     * remove caps and punctuation. basically getting rid of grammar. should be a small method
     * using replaceAll
     * @param String or word we want to remove grammar from
     * @return same string containing only lowercase
     */
    public static String removeGrammar(String ridString){
        ridString = ridString.replaceAll("[A-Z ]", "").toLowerCase();
        return ridString;
    } // method removeGrammar

    /**
     * Create and return array with all the words (elements) included and add more space
     * @param Integer to make array larger
     * include a string array 
     * @return new array with more space
     * not sure if this method works as it was created after making the readBook method
     */
    private static String[] addArray(String [] x, int size){
        // create new array with increased size (adding 1 index)
        String[] y = new String [x.length + size];
        // copy and paste into the new array
        for(int k = 0; k<x.length; k++){ // iterate thru array paremeter
            y[k] = x[k]; // puts the old string array into a new string array
        }
        x = y; // string [] x is now in the NEW array 
        return x;
    } // method addArray

    // method that checks for repetition. Use an if Loop to add the word if not there,
    // if it is there skip
    // @param String[] to check each element
    // @param string to test for
    // if repetition is true, skip. if it is false, add.
    public static boolean arrayRepetition(String [] x, String scanWord){
        // automatically it should be false as no word are in the array at first
        boolean ifRepeat = false;
        int wordCount = 0; // scan the array from index 0

        //while loop thru array
        while(ifRepeat && wordCount < x.length){
            // if NOT null(repeat), tell us if it is true or false and move over
            if (x[wordCount] != null){
            wordCount++;
            } else {
                continue; // continue on thru loop
                
            }
        }  

        return ifRepeat;
    } // method arrayRepetition

    public static void printDictionary(){
        String[] dictionary = readBook(browseTextFile(bookLink));
        for (int i = 0; i < dictionary.length; i++){
            System.out.printf("\t1%d: %s\n",i+1,dictionary[i]);
        }
    } // method printDictionary

    public static String bookLink = "https://www.gutenberg.org/files/98/98-0.txt";
    /** Use main() to call other methods; don't put all your code in main. */
    public static void main(String[] args) {
        readBook(browseTextFile(bookLink));
        printDictionary();
    }  // method main
    
}  // class BookToDictionary

