package MiniProjekt4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TranzakcioTipus {
    DEPOSIT,
    WITHDRAW
}

public class Tranzakcio {
    public LocalDateTime idopont;
    public TranzakcioTipus tranzTipus;
    public double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Idopont= " + formatter +
                ", TranzTipus= " + tranzTipus +
                ", Osszeg= " + osszeg + "\n";
    }

    public TranzakcioTipus getTranzTipus() {
        return tranzTipus;
    }
}
