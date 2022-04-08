public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean naine;
    char symbol;

    public Human(String nimi, int vanus, double pikkus, boolean naine) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.naine = naine;
        this.symbol = 'R';
    }

    // to ---> võtan toString() --> enter

    public void sayHello() {
        System.out.println(nimi + " ütleb hello");
    }

    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", naine=" + naine +
                ", symbol=" + symbol +
                '}';
    }
}
