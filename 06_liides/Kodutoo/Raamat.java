package Kodutoo;

public class Raamat implements Meelelahutus{
    String pealkiri;
    int aasta;
    String autor;
    int pikkus;

    public Raamat(String pealkiri, int aasta, String autor, int pikkus){
        this.pealkiri = pealkiri;
        this.aasta = aasta;
        this.autor = autor;
        this.pikkus = pikkus;
    }

    @Override
    public String getSisestatud(){
        return "Raamatu pealkiri on: " + this.pealkiri +
                "\n" + "Ilmumisaeg: " + this.aasta + "\n" +
                "Autoriks on: " + this.autor + "\n" +
                "Pikkuseks on: " + this.pikkus + "lehte";

    }

    @Override
    public void setPealkiri(String pealkiri){
        this.pealkiri = pealkiri;
    }

    @Override
    public void setAasta(int aasta) {
        this.aasta = aasta;
    }

    @Override
    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public void setPikkus(int pikkus){
        this.pikkus = pikkus;
    }
}
