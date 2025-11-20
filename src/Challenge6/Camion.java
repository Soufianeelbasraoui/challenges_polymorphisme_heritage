package Challenge6;

public class Camion extends Vehicule{
    public Camion(String modele, String marque) {
        super(modele, marque);
    }

    @Override
    public void demarrer() {
        System.out.print("\ncamion demarrer");
    }
}
