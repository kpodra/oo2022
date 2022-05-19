package kodutoo;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        Car.drive();

        Megastar megastar = new Megastar();
        Megastar.sinking();

        Boeing747 boeing747 = new Boeing747();
        Boeing747.go();

        AirbusA300 airbusA300 = new AirbusA300();
        AirbusA300.falling();
    }
}
