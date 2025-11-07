
import java.util.Scanner;

public class ifCetakKRS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("---Print KRS Siakad---");
System.out.println("Have the tuition fees been paid full? (true/false): ");
boolean uktLunas = sc.nextBoolean();

if (uktLunas) {
    System.out.println("UKT payment has been verified");
    System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
    
}
    }

}