package projet.menu;

public class Menu {

    // Methode static pour afficher Menu
    public static void AfficherMenu() {
        System.out.println();
        System.out.println("------------ Systeme d'automatisation domotique ---------------");
        System.out.println("1 - Gestion Bedroom");
        System.out.println("2 - Gestion Cuisine");
        System.out.println("3 - Gestion Garage");
        System.out.println("4 - Quitter le programme");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour lire les donnees
    public static void MenuBedroom() {
        System.out.println();
        System.out.println("a - Allumer les lumieres");
        System.out.println("b - Changer Etat Climatiseur");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour supprimer les donnees
    public static void MenuCuisine() {
        System.out.println();
        System.out.println("a - Allumer le four");
        System.out.println("b - Fermer la porte");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour supprimer les donnees
    public static void MenuGarage() {
        System.out.println();
        System.out.println("a - Ouvrir les fenetres ");
        System.out.println("b - Ouvrir la Porte");
        System.out.println("c - Verroullier la Porte");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

}
