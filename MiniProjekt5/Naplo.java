package MiniProjekt5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Naplo {
    private final ArrayList<Hallgato> hallgatok;

    public Naplo(String fajlnev) {
        this.hallgatok = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/MiniProjekt5/hallgatok.csv");
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] elemek = line.split(",");
                String vezeteknev = elemek[0];
                String keresztnev = elemek[1];
                Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                hallgatok.add(hallgato);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void listazNevek() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getID() + ". " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
            ArrayList<String> tantargyak = hallgato.getTantargyak();
            for (String tantargy : tantargyak) {
                float atlag = hallgato.tantargyAtlag(tantargy);
                if (atlag != 0) {
                    System.out.println(tantargy + ": " + atlag);
                }
            }
        }
    }
}
