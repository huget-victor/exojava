public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int heure1 = 12;
        int minutes = 34;
        int secondes = 56;
        System.out.println(" il est " + heure1 + " heure " + minutes + " minutes " + secondes + " secondes ");
        int calcul = 12*60*60;
        int calcule2 = 34*60;
        int calcul3 = calcul + calcule2 + secondes;
        System.out.println(" Il s'est écouler " + calcul3 + " seonde depuis minuit ");
    }
}


