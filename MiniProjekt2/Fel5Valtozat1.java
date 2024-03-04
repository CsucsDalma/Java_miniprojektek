package MiniProjekt2;

import java.util.Arrays;

public class Fel5Valtozat1 {
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3, 4, 5};
        System.out.print("Tomb elemei csere elott: ");
        System.out.println(Arrays.toString(szamok));

        int ujElsoElem = 12;
        int ujUtolsoElem = 25;

        szamok[0] = ujElsoElem;
        szamok[szamok.length - 1] = ujUtolsoElem;

        System.out.print("Tomb elemei csere utan: ");
        System.out.println(Arrays.toString(szamok));
    }
}
