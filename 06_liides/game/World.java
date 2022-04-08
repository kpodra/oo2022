package game;

import java.util.List;

public class World {
    public int height;
    int worldHeight;
    int width;
    List<Item> items; // kodutoos peab olema omaloodud klass selle ees
    //ei pea tegema kodutoos listi aga voib teha

    public World(int height, int width) {
        this.worldHeight = height;
        this.width = width;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordianteX) {
        // fori --> pakub
        char symbol;   // deklareerib 1x muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).CoordinateY == y && items.get(i).CoordinateX == x){
                        symbol = 'I';
                        break;
                    }

                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordianteX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
