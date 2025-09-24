import java.util.Scanner;
import java.util.Random;

public class Devine_le_nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");
        int proposition = scanner.nextInt();
        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreSecret);
        int difference = Math.abs(proposition - nombreSecret);
        System.out.println("Vous étiez à " + difference + " de la bonne réponse.");
        scanner.close();
    }
}