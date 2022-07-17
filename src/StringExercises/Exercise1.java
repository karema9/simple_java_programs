package StringExercises;

/**
 * Write a program to get the character index given within the string
 */
public class Exercise1 {
    // Driver code
    public static void main (String[] args){
        String noun = "King Arthur";
        stringInd("James",3);


        // Helpful for looping through arrays
        for(int i=0; i < noun.length(); i++){
            System.out.println(i+" => "+noun.charAt(i)+" Unicode =>"+noun.codePointAt(i));
        }

    }

    public static void stringInd(String str, int index){
        int strIndex = str.charAt(index);
        int unicodeVal = str.codePointAt(index);

        System.out.println(" Character at index: "+index+" => "+strIndex+" "+unicodeVal);

    }
}
