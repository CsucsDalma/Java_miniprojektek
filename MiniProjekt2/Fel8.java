package MiniProjekt2;

import java.util.Arrays;

public class Fel8 {
    public static void main(String[] args) {
        int[] szamok = {9, 49, 51, 61, 18, 3, 103, 301};
        System.out.println("Rendezetlen tomb: ");
        System.out.println(Arrays.toString(szamok));
        for (int i = 0; i < szamok.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < szamok.length; j++) {
                if (szamok[j] < szamok[index]) {
                    index = j;
                }
            }
            int csere = szamok[index];
            szamok[index] = szamok[i];
            szamok[i] = csere;
        }

        System.out.println("Novekso sorrendbe rendezet tomb: ");
        System.out.println(Arrays.toString(szamok));
    }
}
