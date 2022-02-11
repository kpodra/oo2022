public class Game {
    // main --> pakub
    public static void main(String[] args) {
        //sout --> pakub
        System.out.println("Hello World");
        //String -- sõnaline muutuja
        //char -- üks täht
        //int -- täiskohaline number
        //double -- 15kohaline komakohaga number
        //float -- 7kohaline komakohaga number(täiskoht on 16 ja 8 neil kahel) ei kasutata eriti
        //int -- täiskohaline number 2.1mlj
        //byte -- 127 kohta
        //short -- 32000 kohta
        //Long -- 9,223,372,036,854,775,807 (läheb AB)
        //boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;


        // fori --> pakub
        char symbol;  //deklareerib 1x muutuja, mitte iga kord
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
