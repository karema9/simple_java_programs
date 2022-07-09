package arrayprograms;

/**
 * Print the elements of the array at even position
 *
 * COMMENTARY
 * The trick here is the where the index(loop variable) is going to start
 * For the even numbers, index begins at the second element of te array
 * For odd numbers, index begins at the first element of the array
 *
 * IMPORTANT: For each the increment will have to increase by two
 */
public class PrintArrayEven {
    public static void main(String [] args){
        int[] numbers = {1,2,3,4,5,6};

        System.out.println("Even numbers in array :>>>");
        for(int i=1; i<numbers.length; i=i+2){
            System.out.println(numbers[i]);
        }

        System.out.println("Odd numbers in array :>>>");
        for(int j=0; j<numbers.length; j=j+2){
            System.out.println(numbers[j]);
        }
    }
}
