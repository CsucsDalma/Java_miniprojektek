package MiniProjekt2;

import java.util.*;

public class Fel7 {
    public static void main(String[] args) {
        int[] szamok = {5, 5, 7, 9, 25, 4, 6, 4, 7};
        System.out.print("Tomb elemei: ");
        System.out.println(Arrays.toString(szamok));
        Set<Integer> azonos = new HashSet<>();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < szamok.length; i++) {
            if (!azonos.add(szamok[i])) {
                lista.add(szamok[i]);
            }
        }
        System.out.println("Azonos elemek: " + lista);
    }
}
