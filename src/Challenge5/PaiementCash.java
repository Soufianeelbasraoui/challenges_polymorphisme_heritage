package Challenge5;

public class PaiementCash extends Paiement{
   @Override
    public void effectuerPaiement(double montant){
       System.out.print("\nPaiement par cash: "+montant);
   }
}
