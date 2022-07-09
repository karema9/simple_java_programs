package arrayprograms;
import static java.util.Arrays.sort;

/**NOOOOOOOOTEE !!!! - BREAK THIS DOWN
 * This program searches for and removes any duplicates elements
 * in an array
 * LOGIC OF THE PROGRAM
 *
 * Thoughts: Fairly complicated piece of logic
 *
 */
public class RemoveDuplicatesArray {

    public static int removeDuplicates (int[] arr, int n){
        // parameter n represents the length of the array
        // also think of n as the number of items in an array
        if(n==0 || n==1){
            // If it is the case an array has only one or two elements
            return n;
        }
        // create an array with n number of elements, this array will be used
        // to add elements which are not duplicates
        int[] temp = new int[n];
        // this would be used as an index for the temporary array
        int j = 0;
        // Iterate through the array
        // NOTE: n = arr.length
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++] = arr[n-1];       // what does this line do

        // Change original array
        for(int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String [] args){
        int[] arr = {10,70,30,90,20,20,30,40,50};

        // unsorted array
        sort(arr);
        int length = arr.length;
        length  = removeDuplicates(arr, length);
        // print the array elements
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
