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
    public String mootoriVahetus() {
        String vahetus;
        if ((läbisõit > 200000)) vahetus = "Autol on vaja mootori vahetust.";
        else vahetus = "Autol ei ole vaja mootori vahetust.";
        return vahetus;
    }

    @Override
    public String õigeMark() {
        String nimi;
        if ((mark == "Lada")) nimi = "Auto mark on Lada.";
        else nimi = "Auto mark ei ole Lada, vaid " + mark + ".";
        return nimi;
    }

    @Override
    public String aastadMoodas() {
        int aastad = (2022 - väljalase);
        String tulemus = "Väljalaskmisest on möödas " + aastad + " aastat.";
        return tulemus;
    }

}
