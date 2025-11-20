package Challenge6;

public class Moto extends Vehicule{

    public Moto(String modele, String marque) {
        super(modele, marque);
    }

    @Override
    public void demarrer() {
        System.out.print("\nMoto demarrer");
    }
}
