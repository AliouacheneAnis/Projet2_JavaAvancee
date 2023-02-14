package projet.Chambre;

import projet.menu.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Bedroom myBedroom = new Bedroom("Bedroom1");
        garage myGarage = new garage("Garage1");
        Kitchen myKitchen = new Kitchen("Kitchen 1");
        Afficher f = new Afficher();

        int choix = 0, choixRep = 0;

        Scanner sc = new Scanner(System.in);

        while (choixRep != 4) {
            Scanner s = new Scanner(System.in);
            // Affichage Menu
            f.AfficherMenu();
            choixRep = sc.nextInt(); // lecture de choix de l'utilisateur
            switch (choixRep) {
                case 1:
                    f.MenuBedroom();
                    choix = s.nextInt();

                    switch (choix) {
                        case 1:
                            myBedroom.AllumerLumiere();
                            break;

                        case 2:
                            myBedroom.ChangerEtatClimatiseur();
                            break;

                        default:
                            System.out.println("Error : Merci de Saisir un chiffre soit 1 ou 2");
                            choix = s.nextInt();
                            break;
                    }
                    break;

                case 2:

                    f.MenuCuisine();
                    choix = s.nextInt();
                    switch (choix) {
                        case 1:
                            myKitchen.AllumerFour();
                            break;

                        case 2:
                            myKitchen.closedoor();
                            break;

                        default:

                            System.out.println("Error : Merci de Saisir un chiffre soit 1 ou 2");
                            choix = s.nextInt();
                            break;
                    }
                    break;

                case 3:
                    f.MenuGarage();
                    choix = s.nextInt();
                    switch (choix) {
                        case 1:
                            myGarage.OuvrirFenetre();
                            break;

                        case 2:
                            myGarage.opendoor();
                            break;

                        case 3:
                            myGarage.lookdoor();
                            break;

                        default:
                            System.out.println("Error : Merci de Saisir un chiffre soit 1, 2 et 3");
                            choix = s.nextInt();
                            break;
                    }
                    break;

                case 4:
                    System.out.print("Merci d'utiliser notre Logiciel");
                    break;

                default:
                    System.out.println("Error : Merci de Saisir un chiffre saisir entre 1 et 4");
                    System.out.println();
                    s.close();
                    break;

            }
        }

        sc.close();
    }
}
