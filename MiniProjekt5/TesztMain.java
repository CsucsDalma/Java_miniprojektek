package MiniProjekt5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TesztMain {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));

        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new
                Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();

        System.out.println();

        Naplo naplo = new Naplo("src/MiniProjekt5/hallgatok.csv");
        naplo.listazNevek();

        System.out.println();
        try {
            FileReader reader = new FileReader("src/MiniProjekt5/jegyek.csv");
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] elemek = line.split(",");
                int ID = Integer.parseInt(elemek[0]);
                String tantargynev = elemek[1];
                int jegy = Integer.parseInt(elemek[2]);
                Jegy ujJegy = new Jegy(tantargynev, jegy);
                naplo.ujJegy(ID,ujJegy);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        naplo.listazHallgatoiAdatok();
    }
}
