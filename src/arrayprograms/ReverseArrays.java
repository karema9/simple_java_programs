package arrayprograms;

public class ReverseArrays {
    /**
     * This program reverse an array
     *  LOGIC -> The trick is in the for loop when reversing the array
     *  i begins from the last element in the array which can be accessed by Array.length
     *  upperbound: Array.length - 1;
     *  lower bound: i>=0
     *  decrement counter 1--
     */
    public static void main (String [ ] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 4, 5, 6, 9, 10};
        // Display the original array
        System.out.println(" <-- Original array -->");
        for(int loopElement: arr)
            System.out.println(loopElement);

        System.out.println("Revesed array");
        //  Display the array in reverse order
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i] + " ");


        }
        /**
         * IDEAS - other ways to implement this - use a stack
         *  CHALLENGE - try to use the forEach loop to implement this programs
         */
    }
}
