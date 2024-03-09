package MiniProjekt2;

import java.util.Arrays;

public class Fel5Valtozat2 {
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3, 4, 5};
        System.out.print("Tomb elemei csere elott: ");
        System.out.println(Arrays.toString(szamok));

        if (szamok.length >= 2) {
            int csere = szamok[0];
            szamok[0] = szamok[szamok.length - 1];
            szamok[szamok.length - 1] = csere;
        }
        System.out.print("Tomb elemei csere utan: ");
        System.out.println(Arrays.toString(szamok));
    }
}
