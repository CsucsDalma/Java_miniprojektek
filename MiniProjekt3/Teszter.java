package MiniProjekt3;

import java.util.ArrayList;
import java.util.Collections;

public class Teszter {
    public int Eletkor(int eletkor, ArrayList<IKorhataros> korhatarosHorror) {
        int osszBuntetes = 0;
        for (IKorhataros film : korhatarosHorror) {
            if (eletkor < film.Korhatar()) {
                osszBuntetes += film.Buntetes(eletkor);
            }
        }
        return osszBuntetes;
    }

    public static void main(String[] args) {
        ArrayList<Film> lista = new ArrayList<>();

        lista.add(new Film("Coco", 3000));
        lista.add(new Film("Zootropolis - Állati nagy balhé", 2500));
        lista.add(new Film("Agymanók", 2000));
        lista.add(new Film("Csizmás, a kandúr: Az utolsó kívánság", 4105));
        lista.add(new Film("Luca", 3674));
        lista.add(new Film("Micimackó", 1546));

        lista.add(new HorrorFilm("Széttörve", 2567, 12));
        lista.add(new HorrorFilm("Démonok között 2.", 3412, 16));
        lista.add(new HorrorFilm("Az", 2490, 16));
        lista.add(new HorrorFilm("Sikoly", 5000, 18));
        lista.add(new HorrorFilm("Hang nélkül 2", 3967, 12));
        lista.add(new HorrorFilm("A sötétség gyermekei", 4000, 18));

        for (Film film : lista) {
            System.out.println(film);
        }
        Collections.sort(lista, (film1, film2) -> film1.getAr() - film2.getAr());
        System.out.println();
        System.out.println("Ar szerint rendezett lista:");
        for (Film film : lista) {
            System.out.println(film);
        }
        System.out.println();
        ArrayList<IKorhataros> korhataros = new ArrayList<>();
        for (Film film : lista) {
            if (film instanceof HorrorFilm) {
                korhataros.add((HorrorFilm) film);
            }
        }
        for (IKorhataros film : korhataros) {
            System.out.println(film);
        }
    }
}
