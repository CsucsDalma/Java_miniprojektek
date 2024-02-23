package MiniProjekt1;

import java.util.Scanner;

public class Fel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szam:");
        int szam = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int szorzas = szam * i;
            System.out.println(szam + "*" + i + "=" + szorzas);
        }
    }
}