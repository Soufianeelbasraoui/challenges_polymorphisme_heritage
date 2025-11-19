package Challenge4;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(double solde, int numero, double tauxInteret) {
        super(solde, numero);
        this.tauxInteret = tauxInteret;
    }
    public void appliquerInteret() {
        double interet = getSolde()* tauxInteret / 100;
        double solde = interet;
        System.out.println("Interets appliques : " + interet + " Nouveau solde : " + solde);
    }

}
