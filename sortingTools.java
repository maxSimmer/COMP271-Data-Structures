import java.util.Arrays;

public class sortingTools {
    
    static int[] merge(int[] a, int[] b){
        
        
        //output array is as long as the 2 input arrays together
        int[] c = new int[a.length+b.length];

        //pointers to a, b the left most elements
        int leftMostA = 0;
        int leftMostB = 0;
        //pointer for output array
        int i = 0;
        //as long as both input arrays have elements:
        while(leftMostA < a.length && leftMostB < b.length){
            // compare a,b and assign the smallest to c
            // move that leftmost pointer +1
            if (a[leftMostA] < b[leftMostB]){
                c[i] = a[leftMostA];
                leftMostA++;

            } else {
                c[i] = b[leftMostB];
                leftMostB++;
            }
            i++;
        
        }
        // at the end of this loop, one of the two loops will be exhausted
        // assume tis array b that is exhausted
        //copy remaing elements of a into c
        while (leftMostA < a.length){
            c[i] = a[leftMostA];
            i++;
            leftMostA++;
        }
        // assume array a is exhausted
        // copy elements of b into c
        while (leftMostB < b.length){
            c[i] = b[leftMostB];
            i++;
            leftMostB++;
        }
        return c;

    }
    

    public static void main(String[] args){
        int [] foo = {10, 11, 13, 14};
        int [] bar = {-4, 20, 21, 99};
        int [] merged = merge(foo, bar);
        System.out.println(Arrays.toString(merged));
        

    }
    
}
