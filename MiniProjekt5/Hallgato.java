package MiniProjekt5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hallgato {
    private static int id = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private final ArrayList<Jegy> jegyek;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = id++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.jegyek = new ArrayList<Jegy>();
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public float tantargyAtlag(String tantargyneve) {
        int osszeg = 0;
        int db = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getTantargynev().equals(tantargyneve)) {
                osszeg += jegy.getJegy();
                db++;
            }
        }
        if (db == 0) {
            return 0;
        }
        return (float) osszeg / db;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        HashSet<String> hozzaadottTantargyak = new HashSet<>();
        try {
            FileReader reader = new FileReader("src/MiniProjekt5/jegyek.csv");
            Scanner in = new Scanner(reader);
            for (Jegy jegy : jegyek) {
                if (!hozzaadottTantargyak.contains(jegy.getTantargynev())) {
                    tantargyak.add(jegy.getTantargynev());
                    hozzaadottTantargyak.add(jegy.getTantargynev());
                }
            }
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] elemek = line.split(",");
                String tantargy = elemek[1];
                if (!hozzaadottTantargyak.contains(tantargy)) {
                    tantargyak.add(tantargy);
                    hozzaadottTantargyak.add(tantargy);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println(vezeteknev + " " + keresztnev);
        ArrayList<String> tantargyak = getTantargyak();
        for (String tantargy : tantargyak) {
            float atlag = tantargyAtlag(tantargy);
            if (atlag != 0) {
                System.out.println(tantargy + ": " + atlag);
            }
        }
    }
}

