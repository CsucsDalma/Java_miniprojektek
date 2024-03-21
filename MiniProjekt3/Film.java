package MiniProjekt3;

interface IKorhataros {
    int Korhatar();

    int Buntetes(int buntetes);
}

class Film {
    private String cim;
    private int ar;
    int[] velemenyek;
    int maxVelemenyek = 20;


    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[maxVelemenyek];
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int szam) {
        if (szam >= 1 && szam <= 5) {
            for (int i = 0; i < velemenyek.length; i++) {
                if (velemenyek[i] == 0) {
                    velemenyek[i] = szam;
                    return;
                }
            }
            System.out.println("Betelt a velemnyek tarolasara szant hely!");
        } else {
            System.out.println("Hibas ertek, 1 es 5 kozott valasz!");
        }
    }

    public double Atlag() {
        double osszeg = 0;
        int szamol = 0;
        for (int i = 0; i < velemenyek.length; i++) {
            if (velemenyek[i] != 0) {
                osszeg += velemenyek[i];
                szamol++;
            }
        }
        if (szamol == 0) {
            System.out.println("Meg nincsennek velemenyek.");
            return 0;
        }
        return osszeg / szamol;
    }

    @Override
    public String toString() {
        return "Film cime: " + cim + ", Film ara: " + ar;
    }
}


