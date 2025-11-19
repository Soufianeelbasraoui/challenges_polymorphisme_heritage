package Challenge1;

public class Cercle extends Forme{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return  3.14 * rayon*2;
    }
    public  void afficherRayon(){
        System.out.print("Rayon:"+rayon);
    }
}
