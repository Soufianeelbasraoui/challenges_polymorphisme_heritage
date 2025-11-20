package Challenge5;

public class PaiementVirement extends Paiement{

    @Override
    public void effectuerPaiement(double montant) {
        System.out.print("\npaiement par virement: "+montant);
    }
}
