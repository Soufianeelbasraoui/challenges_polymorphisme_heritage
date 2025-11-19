package Challenge4;

public class Main {
    public static  void main(String[] args){
     CompteCourant comptcour=new CompteCourant(1, 1000, 500);
     comptcour.verser(2000);
     comptcour.retirer(300);
     CompteEpargne ce1=new CompteEpargne(2, 2000, 5);
     ce1.appliquerInteret();
    }
}
