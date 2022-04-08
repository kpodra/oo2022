package Kodutoo;

import Kodutoo.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Oranž", 1970, 10000, 150000);

        System.out.println("Auto mark on " + car.getmark() + " ja auto on " + car.getvärv() + " värvi.");
        System.out.println("Auto lasti välja " + car.getväljalase() + "aastal ja auto maksab " + car.gethind() + " eurot.");

        System.out.println("Sisesta oma raha kogus: ");

        car.autoOst();



    }
}
