package arrayprograms;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * APPROACH: 1 : Using a dummy array
 *           2: Using a dequeue
 */
public class RotateArray {

    // Driver cods
    public static void main(String[]args){
        int[] arrays = {10,20,60,70,80,90};

        rotateArr(arrays, 3);
    }
    public static int rotateArr(int[] array, int n){
        ArrayDeque<Integer> deq = new ArrayDeque<>();

        int[] placeholder = new int[n];

        // Figure this out, how to remove elements from dequeue, n number pf  times
        // while adding them to the placeholder array simultaneously
        for(int i=0; i<n; i++){
            placeholder[i] = deq.removeFirst();
        }
        /**
        while(n!=0){
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111
            // THW PROBLEM IS HERE
            placeholder[++index]= deq.remove();
        }
        **/
        System.out.println("Dummy array value >> ");
        for(int j : placeholder){
            System.out.println(placeholder[j]);
        }
        // Pushing elements from dummy array to the stack
        for(int i=0; i<placeholder.length; i++){
            deq.push(placeholder[i]);
        }
        System.out.println("Rotated array >>");
        System.out.println(deq);
        return 1;
    }
}
