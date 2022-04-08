public class Main1 {
    public static void main(String[] args) {
        //Arvuti arvuti = new Arvuti(new Info("asd", "ads", "ssd", 1,1));

        Info info = new Info("asd", "addf", "dsd", 1, 1 );
        Arvuti arvuti = new Arvuti(info, 1999);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}

//üks java klass teise java klassi sees nt arvuti mille sees on info
//võiks teha ka enumiga ühe lahenduse
