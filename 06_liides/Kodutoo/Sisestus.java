package Kodutoo;

public class Sisestus {
    public static void main(String[] args) {
        Raamat raamat = new Raamat("Serafima ja Bogdan", 2017, "Vahur Afanasjev", 560);
        Raamat raamat1 = new Raamat("Ring", 2015, "Dave Eggers", 366);
        Raamat raamat2 = new Raamat("Parandada elavaid",2018, "Maylis de Kerangal", 213 );
        Film film = new Film("1944", 2015, "Leo Kunnas", 100);
        Film film1 = new Film("Kratt", 2020, "Rasmus Merivoo", 107);
        Film film2 = new Film("Kiirtee põrgusse", 2019, "Urmas Eero Liiv", 82);
        Etendus etendus = new Etendus("Eesti matus", 2002, "Andrus Kivirähk", 120);


        System.out.println(raamat.getSisestatud() + "\n---");
        System.out.println(raamat1.getSisestatud() + "\n---");
        System.out.println(raamat2.getSisestatud() + "\n---");
        System.out.println(film.getSisestatud() + "\n---");
        System.out.println(film1.getSisestatud() + "\n---");
        System.out.println(film2.getSisestatud() + "\n---");
        System.out.println(etendus.getSisestatud());
    }
}
