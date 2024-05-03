package MiniProjekt5;

public class Jegy {
    private final String tantargynev;
    private final int jegy;

    public Jegy(String tantargynev, int jegy) {
        this.tantargynev = tantargynev;
        this.jegy = jegy;
    }

    public String getTantargynev() {
        return tantargynev;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Nev: " + tantargynev + ", jegy: " + jegy;
    }
}
