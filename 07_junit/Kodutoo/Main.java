package Kodutoo;

import Kodutoo.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Oranž", 1970, 10000, 150000);
        Car car2 = new Car( "Audi", "Must", 2002, 5000, 25000);
        System.out.println("---------------------------------------------------------");
        System.out.println("Esimese auto mark on " + car.getmark() + " ja auto on " + car.getvärv() + "i värvi.");
        System.out.println("Auto lasti välja " + car.getväljalase() + "aastal ja auto maksab " + car.gethind() + " eurot.");
        System.out.println(car.mootoriVahetus());
        System.out.println(car.aastadMoodas());
        System.out.println(car.õigeMark());
        System.out.println("Sisesta oma raha kogus: ");
        car.autoOst();
        System.out.println("---------------------------------------------------------");
        System.out.println("Teise auto mark on " + car2.getmark() + " ja auto on " + car2.getvärv() + "a värvi.");
        System.out.println("Auto lasti välja " + car2.getväljalase() + " aastal ja auto maksab " + car2.gethind() + " eurot.");
        System.out.println(car2.mootoriVahetus());
        System.out.println(car2.aastadMoodas());
        System.out.println(car2.õigeMark());
        System.out.println("---------------------------------------------------------");



    }
}
