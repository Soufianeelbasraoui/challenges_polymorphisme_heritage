package Challenge2;

public class EmployeCommission extends Employe{
   double ventes;
   double commission;

    public EmployeCommission(String nom, double salaireBase, double ventes, double commission) {
        super(nom, salaireBase);
        this.ventes = ventes;
        this.commission = commission;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + ventes*commission;
    }

}
