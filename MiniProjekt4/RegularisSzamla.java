package MiniProjekt4;

import java.util.ArrayList;
import java.util.List;

interface BankSzamla {
    double getEgyenleg();

    double Betesz(double osszeg);

    double Kivesz(double osszeg) throws NincsElegPenzException;
}

class NincsElegPenzException extends Exception {
    public NincsElegPenzException(String uzenet) {
        super(uzenet);
    }
}

public class RegularisSzamla implements BankSzamla {
    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private static int kovSzamlaSzam = 1;
    private List<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulNev) {
        this.egyenleg = egyenleg;
        this.tulNev = tulNev;
        this.szamlaSzam = szamlaSzam;
        this.tranzakciok = new ArrayList<>();
        ujSzamlaSzam();
    }

    private void ujSzamlaSzam() {
        szamlaSzam++;
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public double Betesz(double osszeg) {
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        egyenleg += osszeg;
        return egyenleg;
    }


    @Override
    public double Kivesz(double osszeg) throws NincsElegPenzException {
        if (egyenleg < osszeg) {
            throw new NincsElegPenzException("Nincs ennyi penz az egyenlegen!");
        }
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg));
        egyenleg -= osszeg;
        return egyenleg;
    }

    @Override
    public String toString() {
        return "Szamlaszam: " + szamlaSzam + ", \nTulajdonos neve: " + tulNev + ", \nEgyenlege: " + egyenleg + ", \nTranzakcio: " + tranzakciok;
    }

    public void DepositTipus() {
        for (Tranzakcio tranzakcio : tranzakciok) {
            if (tranzakcio.getTranzTipus() == TranzakcioTipus.DEPOSIT) {
                System.out.print(tranzakcio);
            }
        }
    }
}
