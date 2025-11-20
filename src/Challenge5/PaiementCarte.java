package Challenge5;

public class PaiementCarte extends Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.print("\n Paiement par cart: " +montant);
    }
}
