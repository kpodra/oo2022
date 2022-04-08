public class GeomeetrilineKeskmine {
    //Geomeetriline keskmine
    //
    //* Koosta funktsioon, mis korrutab parameetritena antud kaks
    // arvu ning võtab neist ruutjuure (Math.sqrt). Katseta.

    //* Arve võib olla rohkem, need antakse ette kogumina.
    // Arvud korrutatakse kokku ning võetakse
    // niimitmes juur (astendaja pöördväärtus, Math.pow), kuimitu arvu oli.

    //* Failis on viie aasta kohta koefitsiendid, kui palju igal aastal palk muutus.
    // Samuti esimese aasta palk. Väljasta teise faili
    // palk igal aastal neist ning võrdlusena kõrvale palk,
    // kui sama alg- ja lõppsumma juures olnuks koefitsient
    // arvutatud geomeetrilise keskmise abil.


    public static void main(String[] args) {

        System.out.println(Korrutamine(4, 8));

        double[] numList1 = Reaalarvud(args);
        double uuedNumbrid = Korrutamine2(numList1);
        System.out.println(uuedNumbrid);

    }

    public static double Korrutamine(double arv1, double arv2){
        double arv = arv1 * arv2;
        return Math.sqrt(arv);
    }

    public static double Korrutamine2(double[] mituArvu){
        double arvud = 1;
        double uusArv = 0;

        for (int i = 0; i < mituArvu.length; i++) {
            arvud = arvud * mituArvu[i];
        }
        double astendamine = 1.0 / mituArvu.length;
        arvud = Math.pow(arvud, astendamine);

        return uusArv;
    }

    public static double[] Reaalarvud(String[] number){
        double[] numList = new double[number.length];
        for (int i = 0; i < number.length; i++) {
            numList[i] = Double.parseDouble(number[i]);
        }
        return numList;
    }




}
