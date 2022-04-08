import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Palk {
    public static double[] failistLugemine(String failinimi) throws IOException{
        ArrayList<String> palk = new ArrayList<String>();

        BufferedReader br = new BufferedReader(
                new FileReader(failinimi));

        String rida = br.readLine();
        while(rida != null){
            palk.add(rida);
            rida = br.readLine();
        }
        br.close();

        double[] uusList = new double[palk.size()];

        int i = 0;
        for(String j: palk){
            uusList[i] = Double.parseDouble(j);
            i++;
        }
        return uusList;
    }

    public static String[] failiKirjutamine(double[] uusPalk, double algnePalk, double keskminePalk, double[] kasvuSuurus, double[] uusPalk3 ) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("palgad.txt"));
        String[] salvestatud = new String[1];

        try{
            pw.println("Alguses oli palk: " + algnePalk);
            pw.print("Keskmine palk oli: " + keskminePalk);
            pw.print(" ");
            for (int i = 5; i < uusPalk.length; i++) {
                pw.print("Uue palga suuruseks " + i + "kuul oli: " + uusPalk[i-1] + "kasv oli: " + Arrays.toString(kasvuSuurus) + "koefitsent:" + uusPalk3[i-2]);
            }
            salvestatud[0] = "Edukalt salvestatud";
        } catch (Exception e){
            salvestatud[0] = "Ei saanud salvestatud..";
        }
        pw.close();

        return salvestatud;
    }

    public static double Korrutamine2(double[] mituArvu){
        double arvud = 1;
        double uusArv;

        for (int i = 1; i < mituArvu.length; i++) {
            arvud = arvud * mituArvu[i];
        }

        double astendamine = 1.0/mituArvu.length;
        uusArv = Math.pow(arvud, astendamine);

        return uusArv;
    }

    public static void main(String[] args) throws IOException {
        double[] a = failistLugemine("aastad.txt");

        double algnePalk = a[0];
        double algnePalk2 = a[1];

        //palga muutumine aastatega
        double[] uusPalk = new double[a.length - 1];
        double uuedPalgad;

        for (int i = 1; i < a.length; i++) {
            uuedPalgad = algnePalk * (1.0 + a[i]);
            algnePalk = Math.round(uuedPalgad * 100.0)/ 100.0;
            uusPalk[i-1] = algnePalk;
        }

        double keskminePalk = Math.round(Korrutamine2(uusPalk)*100.0)/100.0;

        double[] uusPalk2 = new double[a.length];
        uusPalk2[0] = 1232.33;
        for (int i = 0; i < uusPalk.length; i++) {

            double b = Math.sqrt(uusPalk[i]*uusPalk[i+1]);

            double keskminePalk2 = Math.round(b * 100.0)/100.0;
            uusPalk2[i+1] = keskminePalk2;
        }

        String[] kirjutaFaili = failiKirjutamine(uusPalk, algnePalk, keskminePalk, a, uusPalk2);
        System.out.println(kirjutaFaili[0]);
    }






}
