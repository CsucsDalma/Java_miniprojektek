package MiniProjekt1;

import java.util.Scanner;

public class Fel5 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String szoveg = sc.nextLine();
        for (int i = 0; i < szoveg.length(); i++) {
            ch = szoveg.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println("Alfabetikus!");
                break;
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Alfabetikus!");
                break;
            } else if (Character.isUpperCase(ch) && Character.isLowerCase(ch)) {
                System.out.println("Alfabetikus!");
                break;
            } else {
                System.out.println("Nem alfabetikus!");
            }
        }
    }
}
