package StringExercises;

/*
 * Write a program to get the unicode value at the given index within a string
 */

public class Exercise2 {
    // Driver code
    public static void main(String [] args){

    }
    public static void getUnicode(String str, int index){
        int unicode = str.codePointAt(index);
        System.out.println("Unicode");
    }
}
