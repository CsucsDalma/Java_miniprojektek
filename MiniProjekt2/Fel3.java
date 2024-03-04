package MiniProjekt2;

public class Fel3 {
    public static void main(String[] args) {
        String szo = new String("alma");
        System.out.println("Regi szo: "+szo);
        String ujszo = new String();
        for (int i = 0; i < szo.length(); i++) {
            char karalter=szo.charAt(i);
            if (ujszo.indexOf(karalter)==-1){
                ujszo+=karalter;
            }
        }
        System.out.println("Uj szo: "+ujszo);
    }
}
