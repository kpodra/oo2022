public class carInfo {
    String model;
    String transmission;
    String fuel;
    int year;


    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", transmission=" + transmission +
                ", fuel=" + fuel +
                ", year=" + year +
                '}';
    }


    public carInfo(String model, String transmission, String fuel, int year) {
        this.model = model;
        this.transmission = transmission;
        this.fuel = fuel;
        this.year = year;
    }
}








