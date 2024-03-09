package MiniProjekt2;

import java.util.Scanner;

public class Fel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szo: ");
        String szo = sc.nextLine();
        StringBuffer szo2 = new StringBuffer(szo);
        for (int i = 0; i < szo2.length(); i++) {
            char karakter = szo2.charAt(i);
            if (karakter == 'a') {
                szo2.replace(i, i + 1, "*");
            }

        }
        System.out.println(szo2);
    }
}
