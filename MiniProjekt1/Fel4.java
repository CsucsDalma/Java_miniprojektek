package MiniProjekt1;

import java.util.Scanner;

public class Fel4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hany sorja legyen a csillagnak: ");
        int szam = sc.nextInt();
        for (int i = 0; i < szam; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
