package MiniProjekt4;

import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama;
    private static int ingyenesTranzSzama = 3;
    private static double tranzakcioAra = 2.0;

    public FolyoSzamla(String tulNev) {
        super(tulNev);
        this.tranzakciokSzama = tranzakciokSzama;
    }

    @Override
    public double Betesz(double osszeg) {
        tranzakciokSzama++;
        return super.Betesz(osszeg);
    }

    @Override
    public double Kivesz(double osszeg) throws NincsElegPenzException {
        tranzakciokSzama++;
        return super.Kivesz(osszeg);
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > ingyenesTranzSzama) {
            double koltseg = tranzakcioAra * (tranzakciokSzama - ingyenesTranzSzama);
            try {
                Kivesz(koltseg);
                System.out.println("Tranzakciora levont koltseg: " + koltseg);
            } catch (NincsElegPenzException e) {
                System.out.println(e.getMessage());
            }
        }
        tranzakciokSzama = 0;
    }

    @Override
    public String toString() {
        return "FolyoSzamla" +
                "\ntranzakciokSzama: " + tranzakciokSzama +
                ", " + "\n" +
                super.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolyoSzamla folyoszamla = (FolyoSzamla) o;
        return Objects.equals(tulNev, folyoszamla.tulNev) && Objects.equals(szamlaSzam, folyoszamla.szamlaSzam) && Objects.equals(tranzakciokSzama, folyoszamla.tranzakciokSzama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranzakciokSzama);
    }
}
