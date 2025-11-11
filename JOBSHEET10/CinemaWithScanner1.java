package JOBSHEET10;

import java.util.Scanner;

public class CinemaWithScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;

        while (true) {
            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                     
    System.out.print("Enter name: ");
    String name = sc.nextLine();

    int row, column;

    while (true) {
        System.out.print("Enter row number (1 – 4): ");
        row = sc.nextInt();

        System.out.print("Enter column number (1–2): ");
        column = sc.nextInt();
        sc.nextLine(); 

        
        if (row < 1 || row > 4 || column < 1 || column > 2) {
            System.out.println(" Invalid seat position. Please enter a valid row (1–4) and column (1–2).");
        } else if (audience[row - 1][column - 1] != null) {
            System.out.println(" Seat already occupied by " + audience[row - 1][column - 1] + ". Please choose another seat.");
        } else {
            
            audience[row - 1][column - 1] = name;
            System.out.println(" Audience added successfully.");
            break;
        }
    }
    break;
                    
    

                case 2:
                    System.out.println("\n=== AUDIENCE LIST ===");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            String occupant = audience[i][j];
                            System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": " +
                                    (occupant != null ? occupant : "[Empty]"));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid menu choice. Please select 1, 2, or 3.");
            }
        }
    }
}



/* QUESTIONS
1. Should the array elements from the scanner be filled in sequentially starting from the 0th index? Please explain!
Not necessarily. In my program, the array elements are not filled sequentially from index 0. Instead, they are filled based on user input for row and column.
2. Modify the program code to provide the following menu options: 
-	Menu 1: Input audience data 
-	Menu 2: Show audience list 
-	Menu 3: Exit 
DONE
3. Modify the program code to handle if the seat row/column number is not available 
DONE
4. In menu 1, modify the program code to give a warning if the selected seat is already occupied by other audiences, then display a command to enter rows and columns again 
DONE

 */
