package MiniProjekt1;

public class Fel6 {
    public static boolean tombEgyenlosege(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        }
        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int tomb1[] = {1, 2, 3, 4, 9, 8};//Nem egyenloek
        int tomb2[] = {1, 2, 3, 4, 5, 10};

        if (tombEgyenlosege(tomb1, tomb2)) {
            System.out.println("Egyenloek");
        } else {
            System.out.println("Nem egyenloek");
        }

        int tomb3[] = {1, 2, 3, 4, 9, 8};
        int tomb4[] = {1, 2, 3, 4, 9, 8};

        if (tombEgyenlosege(tomb3, tomb4)) {
            System.out.println("Egyenloek");
        } else {
            System.out.println("Nem egyenloek");
        }

        int tomb5[] = {1, 2, 3, 4, 9, 8};
        int tomb6[] = {1, 2, 3, 4, 9};

        if (tombEgyenlosege(tomb5, tomb6)) {
            System.out.println("Egyenloek");
        } else {
            System.out.println("Nem egyenloek");
        }
    }
}
