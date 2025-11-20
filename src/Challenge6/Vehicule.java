package Challenge6;

public class Vehicule {
    private String marque;
    private String modele;

    public Vehicule(String modele, String marque) {
        this.modele = modele;
        this.marque = marque;
    }

    public void demarrer(){
        System.out.print("\nVehicule  demarre");

   }
}
