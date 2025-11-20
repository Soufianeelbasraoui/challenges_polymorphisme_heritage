package Challenge6;

public class Voiture extends Vehicule{
    public Voiture(String modele, String marque) {
        super(modele, marque);
    }

    @Override
    public void demarrer() {
        System.out.print("\nVoitur demarrer");
    }
}
