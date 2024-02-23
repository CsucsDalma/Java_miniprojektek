package MiniProjekt1;

import java.util.Scanner;

public class Fel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number:");
            double szam1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double szam2 = sc.nextDouble();
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            int muvelet = sc.nextInt();
            if (muvelet == 5) {
                break;
            } else if (muvelet == 1) {
                double plusz = szam1 + szam2;
                System.out.println("Result: " + plusz);
            } else if (muvelet == 2) {
                double minusz = szam1 - szam2;
                System.out.println("Result: " + minusz);
            } else if (muvelet == 3) {
                double szor = szam1 * szam2;
                System.out.println("Result: " + szor);
            } else if (muvelet == 4) {
                double osztas = szam1 / szam2;
                System.out.printf("Result: %.2f\n", osztas);
            }
        }
    }
}
