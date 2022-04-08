import java.util.Scanner;

public class Kodutöö {
    public static void main(String[] args) {

        double h;
        System.out.println(jõuksiKülastus(2.5));

        double piletiHind = jõuksiKülastus(7.55);
        System.out.println(piletiHind);

        Funktsioonid.prindiForTsükkel(3);

        Scanner kuu = new Scanner(System.in);
        System.out.println("Jaanuar, Veebruar, Märts, Aprill, Mai, Juuni, Juuli, August, September, Oktoober, November, Detsember");
        System.out.println("Sisesta siia mitmendat kuud soovid: ");
        double mitmes = kuu.nextDouble();
        System.out.println(massiiviLugemine(mitmes));

        Scanner time = new Scanner(System.in);
        System.out.println("Mis kell on?");
        double aeg = time.nextDouble();
        System.out.println();

    }

    public static double jõuksiKülastus(double h){
        return 2.5+7.55*h;
    }
    //void on funktsioon selleks, et midagi teha
    public static void prindiForTsükkel(int kordadeArv) {
        //fori --> genereerin
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
        }
    }


    public static String massiiviLugemine(double mitmes) {
        String[] kuu = {"Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember"};
        return kuu[(int) mitmes - 1];
    }

    public static void valik(double aeg){
        if (aeg < 15) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

    }
}

