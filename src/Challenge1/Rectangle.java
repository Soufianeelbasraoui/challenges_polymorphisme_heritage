package Challenge1;

public class Rectangle extends Forme{
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    @Override
    public double calculerAire() {
        return largeur * hauteur;
    }
    public  void afficherRectangle(){
        System.out.print("largour:"+largeur+ "hauteur:" +hauteur);
    }
}
