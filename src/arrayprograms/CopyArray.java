package arrayprograms;

/**
 * This program copies the contents of from one array to another
 *  NOTE: There is an inbuilt method for this which will also be
 *  demonstrated in this program
 */
public class CopyArray {
    public static void main (String [ ] args){
        // Initialize two different arrays
        int[] copyFromArr = new int[]{1,2,3,4,545,6};
        // Empty array initialization
        int[] copyToArr = new int[copyFromArr.length];


        for( int i = 0; i < copyFromArr.length; i++){
            copyToArr[i]=copyFromArr[i];
            // NOTE: Be careful not to interchange the variables
        }
        System.out.println("Copying......");
        System.out.println("Operation Successful");
        // Print the contents of the array
        for(int element: copyToArr)
            System.out.println(element);


        System.out.println("Alternatively using inbuilt method");

    }
}
