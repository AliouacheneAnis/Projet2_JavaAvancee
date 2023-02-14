package projet.Chambre;

import projet.menu.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Bedroom myBedroom = new Bedroom("Bedroom1");
        garage myGarage = new garage("Garage1");
        Kitchen myKitchen = new Kitchen("Kitchen 1");

        int choix = 0, choixRep = 0;

        Scanner sc = new Scanner(System.in);

        while (choixRep != 5) {

            // Affichage Menu
            Menu.AfficherMenu();
            choixRep = sc.nextInt(); // lecture de choix de l'utilisateur

            switch (choixRep) {
                case 1:
                    Menu.MenuBedroom();
                    choix = sc.nextInt();
                    while (choix != 1 && choix != 2) {

                        switch (choix) {
                            case 1:
                                myBedroom.AllumerLumiere();
                                break;

                            case 2:
                                myBedroom.ChangerEtatClimatiseur();
                                break;

                            default:
                                System.out.println("Error : Merci de Saisir un chiffre soit 1 ou 2");
                                choix = sc.nextInt();
                                break;
                        }
                    }
                    break;

                case 2:

                    Menu.MenuCuisine();
                    choix = sc.nextInt();
                    while (choix != 1 && choix != 2) {
                        switch (choix) {
                            case 1:
                            myKitchen.AllumerFour();
                                break;

                            case 2:
                                myKitchen.closedoor();
                                break;

                            default:

                                System.out.println("Error : Merci de Saisir un chiffre soit 1 ou 2");
                                choix = sc.nextInt();
                                break;
                        }
                    }
                    break;

                case 3:
                    Menu.MenuGarage();
                    choix = sc.nextInt();
                    while (choix != 1 && choix != 2 && choix != 3) {
                        switch (choix) {
                            case 1:
                                myGarage.OuvrirFenetre();
                                break;

                            case 2:
                                myGarage.closedoor();
                                break;

                            case 3:
                                myGarage.lookdoor();
                                break;

                            default:
                                System.out.println("Error : Merci de Saisir un chiffre soit 1, 2 et 3");
                                choix = sc.nextInt();
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Merci d'utiliser notre Logiciel");
                    break;

                default:
                    System.out.println("Error : Merci de Saisir un chiffre saisir entre 1 et 4");
                    System.out.println();
                    break;

            }
        }

        sc.close();
    }
}
