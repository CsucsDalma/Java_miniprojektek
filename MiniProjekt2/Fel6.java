package MiniProjekt2;

import java.util.Arrays;

public class Fel6 {
    public static void main(String[] args) {
        int[] szamok = {62, 55, 99, 22, 8};
        System.out.print("Tomb elemei: ");
        System.out.println(Arrays.toString(szamok));
        int minimum = szamok[0];
        int maximum = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < minimum) {
                minimum = szamok[i];
            }
            if (szamok[i] > maximum) {
                maximum = szamok[i];
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
