package Challenge4;

public class Compte {
    private  int numero;
    private double solde;

    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }
    public double verser(double montant){
        return solde+montant;
    }
    public double retirer(double montant){
     return solde-montant;
        /*if (montant>solde){
            solde-=montant;
        }else {
            System.out.print("sold insuffisant");
        }*/
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
