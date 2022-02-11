import java.util.Scanner;

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
        //Math.random() -- 0 .. 0.9999 - 0 ... 4.9999 -- 0..2 .. 1..3
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, playerCoordinateY,
                playerCoordinateX,enemyCoordinateY, enemyCoordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        // fori --> pakub

        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input){
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }

            printMap(worldHeight, worldWidth, playerCoordinateY,
                    playerCoordinateX,enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }

    } //main klassi lõpp, mille järgi saab teha funktsiooni

    // int -- sama tüüp, mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
                                int enemyCoordinateY, int enemyCoordinateX) {
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
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
