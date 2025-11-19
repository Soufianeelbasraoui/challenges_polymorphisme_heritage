package Challenge2;

public class EmployeHoraire extends Employe{
    private  int heuresTravaillees;
    private int tauxHoraire;

    public EmployeHoraire(String nom, double salaireBase,int heuresTravaillees,int tauxHoraire) {
        super(nom, salaireBase);
        this.heuresTravaillees=heuresTravaillees;
        this.tauxHoraire=tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * tauxHoraire;
    }
}
