package MiniProjekt2;

public class Fel4 {
    public static void main(String[] args) {
        String szo = "aaabbbcc";
        System.out.println("Eredeti szo: ");
        StringBuilder tomorit = new StringBuilder();
        int szamol = 1;
        for (int i = 0; i < szo.length(); i++) {
            if (i < szo.length() - 1 && szo.charAt(i) == szo.charAt(i + 1)) {
                szamol++;
            } else {
                tomorit.append(szo.charAt(i));
                tomorit.append(szamol);
                szamol=1;
            }
        }
        System.out.println("Tmoritett valtozat: "+tomorit);
    }
}
