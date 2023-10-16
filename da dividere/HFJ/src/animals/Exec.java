package animals;

class Exec{
    public static void main(String... args) {

        Cat Baghera = new Cat("Baghera");
        Baghera = null;
        Baghera.makeNoise(); // NullPointerError





        Cat tato = new Cat("tato");
        Cat poldo = new Cat("poldo");

        tato.equals(poldo); // should be false

        tato.makeNoise(); // tato said: meow
        poldo.makeNoise(); // poldo said: meow

        //tato.NOISE_A_CAT_DOES = "woff";
        //Cat.NOISE_A_CAT_DOES = "woff"; //IT IS FINAL

        tato.makeNoise(); // tato said: woff
        poldo.makeNoise(); // poldo said: woff

        String s = "ciao";
        String s2 = "ciao";

        Cat tato2 = new Cat("tato");

        //tato == tato2; //false
        //s == s2; //true

        String s3 = new String("ciao"); //da non fare MAI a meno che tu non sappia esattamente cosa stai facendo
        String s4 = new String("ciao");

        //s3 == s4; //false

        }
    }