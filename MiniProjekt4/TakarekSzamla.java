package MiniProjekt4;

import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata;

    public TakarekSzamla(String tulNev, double kamatRata) {
        super(tulNev);
        this.kamatRata = kamatRata;
    }

    public double hozzaadKamat() {
        double kamat = egyenleg * kamatRata / 100;
        egyenleg += kamat;
        return kamat;
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    @Override
    public String toString() {
        return "TakarekSzamla " +
                "\nkamatRata= " + kamatRata +
                "," + "\n" +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakarekSzamla takarekSzamla = (TakarekSzamla) o;
        return Objects.equals(tulNev, takarekSzamla.tulNev) && Objects.equals(szamlaSzam, takarekSzamla.szamlaSzam) && Objects.equals(kamatRata, takarekSzamla.kamatRata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kamatRata);
    }
}
