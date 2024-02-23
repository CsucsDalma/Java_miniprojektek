package MiniProjekt1;

import java.util.Scanner;

public class Kaveautomata {
    public static void main(String[] args) {
        int alapar = 100;
        int osszeg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hogyan keri a kavet?");
        System.out.println("Dupla cukorral, 1 gomb (120ft):");
        System.out.println("Habos kave, 2 gomb (150ft):");
        System.out.println("Pohar nelkul, 3 gomb (90ft):");
        int valasztas = sc.nextInt();
        if (valasztas == 1) {
            osszeg = alapar + 20;
            System.out.println("Osszeg: " + osszeg);
        } else if (valasztas == 2) {
            osszeg = alapar + 50;
            System.out.println("Osszeg: " + osszeg);
        } else if (valasztas == 3) {
            osszeg = alapar - 10;
            System.out.println("Osszeg: " + osszeg);
        } else {
            System.out.println("Nem jo gombot nyomot, inditsa ujra!");
        }
    }
}
