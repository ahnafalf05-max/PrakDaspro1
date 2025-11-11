package JOBSHEET10;

public class Cinema1 {
    public static void main(String[] args) {
        String [][] audience = new String[4][2];
        audience [0][0] = "Amin";
        audience [0][1] = "Bena";
        audience [1][0] = "Candra";
        audience [1][1] = "Dela";
        audience [2][0] = "Eka";
        audience [2][1] = "Farhan";
        audience [3][0] = "Gisel";
        audience [3][1] = "Hana";

        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);

System.out.printf("%s\t %s\n", audience[0][0], audience[0][1]);
System.out.printf("%s\t %s\n", audience[1][0], audience[1][1]);
System.out.printf("%s\t %s\n", audience[2][0], audience[2][1]);
System.out.printf("%s\t %s\n", audience[3][0], audience[3][1]);

}
    
}
/* QUESTIONS
1. Do array elements have to be filled in sequentially starting from the 0th index? Please 
explain!
No, they don’t have to be
2. Why is there a null in the list of audience names?
It doesn’t fill the array with actual names.
3. Complete the audience list in step 4 so that it looks like the following program code
DONE

 */