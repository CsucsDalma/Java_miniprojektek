package MiniProjekt2;

import java.util.Arrays;

public class Fel8 {
    public static void main(String[] args) {
        int[] szamok={9,49,51,61,18,3,103,301};
        System.out.println("Rendezetlen tomb: ");
        System.out.println(Arrays.toString(szamok));
        Arrays.sort(szamok);
        System.out.println("Novekso sorrendbe rendezet tomb: ");
        System.out.println(Arrays.toString(szamok));
    }
}
