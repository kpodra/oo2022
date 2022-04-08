public class carDetails {
    public static void main(String[] args) {

        carInfo carinfo = new carInfo("Audi","Automatic","Diesel",2012);
        car car = new car(carinfo, 20000);

        String autoInfo = car.getDetails();
        System.out.println(autoInfo);

    }
}
