package MiniProjekt4;

import java.util.ArrayList;

public class TestSzamla {
    public static void main(String[] args) throws NincsElegPenzException {
        ArrayList<RegularisSzamla> lista = new ArrayList<>();
        FolyoSzamla folyoSzamla1 = new FolyoSzamla("Pici Palko");
        FolyoSzamla folyoSzamla2 = new FolyoSzamla("Pici Palko");
        RegularisSzamla regularisSzamla1 = new RegularisSzamla("Piri Piroska");
        TakarekSzamla takarekSzamla1 = new TakarekSzamla("Lakatos Csanad", 7);
        TakarekSzamla takarekSzamla2 = new TakarekSzamla("Moricz Adam", 8);

        lista.add(folyoSzamla1);
        lista.add(folyoSzamla2);
        lista.add(regularisSzamla1);
        lista.add(takarekSzamla1);
        lista.add(takarekSzamla2);

//        Teszt folyoszamlara:
        folyoSzamla1.Betesz(1000);
        folyoSzamla1.Kivesz(786);
        folyoSzamla1.Betesz(1500);
//        Hibat dob:
//        folyoSzamla1.Kivesz(16550);
        folyoSzamla1.Kivesz(150);
        System.out.println(folyoSzamla1);
        folyoSzamla1.levonKoltseg();
        System.out.print("Equals: ");
        System.out.println(folyoSzamla1.equals(folyoSzamla2));

        System.out.println();
//        Teszt regularis szamlara:
        regularisSzamla1.Betesz(589);
        regularisSzamla1.Kivesz(345);
        regularisSzamla1.Betesz(789);
        regularisSzamla1.Betesz(234);
        regularisSzamla1.Kivesz(1000);
        System.out.println("Regularisszamla");
        System.out.println(regularisSzamla1);
        System.out.println(regularisSzamla1.tulNev + " DEPOSIT tipusu tranzakcioi: ");
        regularisSzamla1.DepositTipus();

        System.out.println();
//        Teszt takarek szamlara:
        takarekSzamla1.Betesz(1500);
        takarekSzamla1.Kivesz(912);
        takarekSzamla1.hozzaadKamat();
        System.out.println(takarekSzamla1);
        System.out.println();
        takarekSzamla2.Betesz(15000);
        takarekSzamla2.setKamatRata(9);
        takarekSzamla2.hozzaadKamat();
        System.out.println(takarekSzamla2);
        System.out.print("Equals: ");
        System.out.println(takarekSzamla1.equals(takarekSzamla2));
    }
}
