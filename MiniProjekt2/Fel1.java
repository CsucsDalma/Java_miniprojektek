package MiniProjekt2;

import java.util.Scanner;

public class Fel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szo: ");
        String szo = sc.nextLine();
        if (!szo.isEmpty()) {
            System.out.println("Az elso karakter: " + szo.charAt(0));
            System.out.println("Az utolso karakter: " + szo.charAt(szo.length() - 1));
        } else {
            System.out.println("Nem adott meg szot!");
        }
    }
}
