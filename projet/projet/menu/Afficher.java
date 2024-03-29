package projet.menu;

public class Afficher extends Menu {

    // Methode static pour afficher Menu
    public final void AfficherMenu() {
        System.out.println();
        System.out.println("------------ Systeme d'automatisation domotique ---------------");
        System.out.println("1 - Gestion Bedroom");
        System.out.println("2 - Gestion Cuisine");
        System.out.println("3 - Gestion Garage");
        System.out.println("4 - Quitter le programme");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour lire les donnees
    public final void MenuBedroom() {
        System.out.println();
        System.out.println("1 - Allumer les lumieres");
        System.out.println("2 - Eteint les lumieres");
        System.out.println("3 - Changer Etat Climatiseur");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour supprimer les donnees
    public final void MenuCuisine() {
        System.out.println();
        System.out.println("1 - Allumer le four");
        System.out.println("2 - Eteint le four");
        System.out.println("3 - Ouvrir la porte");
        System.out.println("4 - Fermer la porte");
        System.out.print("Veuillez saisir votre choix SVP : ");
    }

    // Methode static pour supprimer les donnees
    public final void MenuGarage() {
        System.out.println();
        System.out.println("1 - Ouvrir les fenetres ");
        System.out.println("2 - Ouvrir la Porte");
        System.out.println("3 - Verroullier la Porte");
        System.out.print("Veuillez saisir votre choix SVP : ");
        
    }

}
