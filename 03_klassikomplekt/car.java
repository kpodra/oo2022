public class car {
    carInfo carinfo;
    int hind;


    public car(carInfo carinfo, int hind) {
        this.carinfo = carinfo;
        this.hind = hind;
    }

    public String getDetails() {
        return "Auto andmed on: " + this.carinfo + ".Hind on: " + this.hind + " eurot.";
    }
}
