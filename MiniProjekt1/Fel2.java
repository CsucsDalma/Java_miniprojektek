package MiniProjekt1;

import java.util.Scanner;

public class Fel2 {
    public static void jelszoellenorzo(String szo) {
        Scanner sc = new Scanner(System.in);
        int probszam = 3;
        while (probszam > 0) {
            System.out.println("Jelszo:");
            String password = sc.nextLine();
            if (szo.equals(password)) {
                System.out.println("Sikeres belepes!");
                break;
            } else {
                probszam--;
                if (probszam == 0) {
                    System.out.println("Sikertelen belepes, helytelen jelszo!");
                } else {
                    System.out.println("Helytelen jelszo meg " + probszam + " probalkozas maradt!");
                }
            }
        }
    }

    public static void main(String[] args) {
        jelszoellenorzo("Alma11");
    }
}

