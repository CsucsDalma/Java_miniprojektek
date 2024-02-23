package MiniProjekt1;

import java.util.Random;
import java.util.Scanner;

public class Alkalmazas {
    public static void main(String[] args) {
        Random random = new Random();
        int randomszam = random.nextInt(100) + 1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Otlet:");
        while (true) {
            int valasztas = sc.nextInt();
            if (valasztas < randomszam) {
                System.out.println("kevés – a szám nagyobb:");
                n += 1;
            } else if (valasztas > randomszam) {
                System.out.println("sok – a szám kisebb:");
                n += 1;
            } else {
                n+=1;
                System.out.println("Gratulalok eltalaltad, ennyi " + n + " lepes alatt!");
                break;
            }
        }
    }
}
