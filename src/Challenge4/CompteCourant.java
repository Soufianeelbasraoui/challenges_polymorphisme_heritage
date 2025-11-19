package Challenge4;

public class CompteCourant extends Compte {
    private double limiteDecouvert;
    public CompteCourant(double solde, int numero,double limiteDecouvert) {
        super(solde, numero);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public double retirer(double montant) {
        return super.retirer(montant);
    }
}
