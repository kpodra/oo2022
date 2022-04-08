package Kodutoo;

public class Film implements Meelelahutus{
    String pealkiri;
    int aasta;
    String autor;
    int pikkus;

    public Film(String pealkiri, int aasta, String autor, int pikkus){
        this.pealkiri = pealkiri;
        this.aasta = aasta;
        this.autor = autor;
        this.pikkus = pikkus;

    }

    @Override
    public String getSisestatud(){
        return "Filmi pealkirjaks on: " + this.pealkiri +
                "\n" + "Väljalaske aastaks: " + this.aasta +
                "\n" + "Autoriks: " + this.autor + "\n" + "Pikkuseks on: "
                + this.pikkus + "minutit";
    }

    @Override
    public void setPealkiri(String pealkiri){
        this.pealkiri = pealkiri;
    }

    @Override
    public void setAasta(int aasta){
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
