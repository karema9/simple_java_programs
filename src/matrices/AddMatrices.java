package matrices;

/**
 * Program takes two matrices and adds them together
 * COMMENTARY: Use of nested for loops
 *
 * NOTE: brute force takes quadratic time : find a more efficient solution
 *
 * add a method that does the operations given a n x n matrix,
 * method should also check is array is jagged
 *
 * The same logic applies for multiplication and subtraction of numbers
 */

public class AddMatrices {
    public static void main(String[]args){

        // create two matrices
        int[][] mat1 = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] mat2 = {{1,2,3},{1,2,3},{1,2,3}};

        // create another matrix with the same dimensions for
        // storing the sum of the two matrices
        int[][] sum = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();
        }
    }
}
