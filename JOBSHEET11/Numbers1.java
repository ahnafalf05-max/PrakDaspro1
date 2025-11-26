package JOBSHEET11;

import java.util.Arrays;

public class Numbers1 {
    public static void main(String[] args) {

        
        int[][] myNumbers = new int[3][5];

        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + Arrays.toString(myNumbers[i]));
        }

        
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }

        
        int value = 1;
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                myNumbers[i][j] = value++;
            }
        }

        
        System.out.println("\nUpdated array with values:");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + Arrays.toString(myNumbers[i]));
        }
    }
}
    

/* QUESTIONS
1.	Add the following program code: 
DONE
2.	What is the function of Arrays.toString()? 
used to convert an array into a readable string format.
3. What is the default value for elements in an array with the data type int? 
an array of int  without initializing its elements, each element is automatically set to the default value
4.	Add the following program code: 
DONE
5.	The myNumbers array has a different length for each row. How to make the length for each row the same? Can the array length be modified? 
DONE
 */