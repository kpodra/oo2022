public class Hulknurk {
    public static void main(String[] args) {
        Klass klass = new Klass();
        klass.setxCoords(3, 4, 5);
        klass.setyCoords(6, 7, 8);

        Klass klass2 = new Klass();
        klass2.setxCoords(3, 8, 9);
        klass2.setyCoords(1, 6, 8);

        System.out.println(klass);
        System.out.println(klass2);

    }
}
