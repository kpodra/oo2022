// parem klõps -> new Java class -> main
// main --> enter

    public class Main {
        public static void main(String[] args) {
            Human one = new Human("Kati",33,1.56,true);
            Human two = new Human("Jeebus",3123,313.22,true);

            System.out.println(one);
            System.out.println(two);

            one.sayHello();
            two.sayHello();

            // main meetod 1 class
            // uus klass, kus on vähemalt 2 muutujat
            //                  vähmalt 1 funktsioon
            //              toString() funktsioon
            // main meetodis on seda vähemalt 2 korda välja kutsutud
            //          funktsiooni välja kutsutud
        }
    }

