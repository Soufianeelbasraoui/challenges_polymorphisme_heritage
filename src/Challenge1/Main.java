package Challenge1;

public class Main {
    public static void main(String[] args){
        Forme[] formes = {
                new Cercle(5),
                new Rectangle(12, 4),
                new Cercle(3.5)
        };
        System.out.println("--- Calcul des Aires");
        for (Forme f : formes){
            System.out.println("Aire calculée: " + f.calculerAire());
        }
    }

    }

