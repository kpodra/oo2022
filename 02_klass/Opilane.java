public class Opilane {
    String opilane;
    int vanus;
    String kool;
    String eriala;
    boolean l6petanud;
    char symbol;

    public Opilane(String opilane, int vanus, String kool, String eriala, boolean l6petanud){
        this.opilane = opilane;
        this.vanus = vanus;
        this.kool = kool;
        this.eriala = eriala;
        this.l6petanud = l6petanud;
        this.symbol = 'S';
    }

    // to ---> võtan toString() --> enter

    public void student() {
        System.out.println(opilane + " on kooli nimekirjas olemas!");
    }
    @Override
    public String toString() {
        return "Opilane{" +
                "opilane='" + opilane + '\'' +
                ", vanus=" + vanus +
                ", kool=" + kool +
                ", eriala=" + eriala +
                ", l6petanud=" + l6petanud +
                ", symbol=" + symbol +
                '}';
    }

}
