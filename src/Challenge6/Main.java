package Challenge6;

public class Main {
    public static void main(String[] args){
        Vehicule v1 = new Voiture("Peugeot", "208");
        Vehicule v2 = new Moto("Yamaha", "MT-07");
        Vehicule v3 = new Camion("Volvo", "FH16");

        v1.demarrer();
        v2.demarrer();
        v3.demarrer();

    }
}
