package Challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      List<Employe> employes = new ArrayList<>();
      employes.add(new EmployeHoraire("Ali", 0, 160, 50));
      employes.add(new EmployeCommission("Sara", 2000, 10000, 0.1));
      for (Employe e : employes) {
          System.out.println(e.nom + " salaires: " + e.calculerSalaire());
      }
  }
}
