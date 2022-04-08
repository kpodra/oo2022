package Kodutoo;

import java.util.Scanner;

public class Car implements CarObject {
    String mark;
    String värv;
    int väljalase;
    int hind;
    int läbisõit;

    public Car(String mark, String värv, int väljalase, int hind, int läbisõit) {
        this.mark = mark;
        this.värv = värv;
        this.väljalase = väljalase;
        this.hind = hind;
        this.läbisõit = läbisõit;
    }
    public void autoOst() {
        Scanner scanner = new Scanner(System.in);
        int raha = scanner.nextInt();
        System.out.println("Sulle jääb alles peale ostu " + (raha - hind) + " eurot");
    }

    @Override
    public String getmark() {
        return mark;
    }

    @Override
    public String getvärv() {
        return värv;
    }

    @Override
    public int getväljalase() {
        return väljalase;
    }


    @Override
    public int gethind() {
        return hind;
    }

    @Override
    public boolean mootoriVahetus() {
        boolean vahetus;
        if ((läbisõit > 200000)) vahetus = true;
        else vahetus = false;
        return vahetus;
    }

    @Override
    public boolean õigeMark() {
        boolean nimi;
        if ((mark == "Lada")) nimi = true;
        else nimi = false;
        return nimi;
    }

    @Override
    public boolean aastadMoodas() {
        int aastad = (2022 - väljalase);
        boolean moodas;
        if (aastad >= 40) moodas = true;
        else moodas = false;
        return moodas;
    }

}
