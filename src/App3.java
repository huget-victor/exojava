import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les heures");
        int heure = clavier.nextInt();
        System.out.println(" Entrez les minutes");
        int minutes = clavier.nextInt();
        System.out.println("Entrez les secondes");
        int secondes = clavier.nextInt();
        clavier.close();
        int calcul = heure*60*60;
        int calcul2 = minutes*60;
        int calculFinal = calcul + calcul2 + secondes;
        int resultat = 86400 - calculFinal; 
        System.out.println(" Il est " + heure + " h " + minutes + " min " + secondes + " s. ");
        System.out.println(" Il s'est écoulé " + resultat + " seconde avant minuit ");
    }
}


