package JOBSHEET10;

import java.util.Scanner;

public class SIAKAD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int[4][3]; 

        
        for (int i = 0; i < score.length; i++) {
            double sumForEachStudent = 0;
            System.out.println("Enter score for student #" + (i + 1));

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("Course #" + (j + 1) + ": ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }

            double average = sumForEachStudent / score[i].length;
            System.out.println("Average score #" + (i + 1) + ": " + average);
            System.out.println();
        }

        
        System.out.println("Rata-rata per Mata Kuliah:");
        for (int j = 0; j < 3; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < 4; i++) {
                sumForEachCourse += score[i][j];
            }

            
            System.out.println("Course #" + (j + 1) + ": " + sumForEachCourse);
        }

        sc.close();
    }
}