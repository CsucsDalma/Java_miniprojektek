package MiniProjekt3;

class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int kor) {
        if ((kor - Korhatar()) < 0) {
            return Math.abs(kor - Korhatar() * getAr());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Horror film cime: " + getCim() + ", Film ara: " + getAr() + ", korhatar: " + Korhatar();
    }
}
