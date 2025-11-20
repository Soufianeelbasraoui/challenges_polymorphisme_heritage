package Challenge5;

public class Main {

    public static void main(String[] args){
    Paiement p1=new PaiementCarte();
    Paiement p2=new PaiementCash();
    Paiement p3=new PaiementVirement();
    p1.effectuerPaiement(10.0);
    p2.effectuerPaiement(6.7);
    p3.effectuerPaiement(20.11);

    }
    public void traiterPaiement(Paiement p, double montant) {
        p.effectuerPaiement(montant);
    }
}
