package week5;

import java.util.Scanner;

/**
 * Selection214
 */
public class Selection214 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        double uas = input14.nextInt();
        System.out.print("Nilai uts : ");
        double uts = input14.nextInt();
        System.out.print("Nilai tugas : ");
        double tugas = input14.nextInt();
        System.out.print("Nilai quiz : ");
        double quiz = input14.nextInt();

        double total = (uas *0.4) + (uts * 0.3) + (tugas * 0.2) + (quiz * 0.1);

        String message  = total < 65 ? "Retake" : "Pass";

        System.out.println("Total : " + total + "\n" + message);
}
}