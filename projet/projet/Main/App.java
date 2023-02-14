package projet.Main;

import projet.Chambre.*;
import projet.menu.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // declaration des instance 
        Bedroom myBedroom = new Bedroom("Bedroom1");
        garage myGarage = new garage("Garage1");
        Kitchen myKitchen = new Kitchen("Kitchen 1");
        Afficher f = new Afficher();

        int choix = 0, choixRep = 0;

        Scanner sc = new Scanner(System.in);

        while (choixRep != 4) {

            // Affichage Menu
            f.AfficherMenu();
            choixRep = sc.nextInt(); // lecture de choix de l'utilisateur
            switch (choixRep) {
                case 1:
                    f.MenuBedroom(); // afficher le menu gestion de chambre 
                    choix = sc.nextInt();
                    //verifier la reponse d'utilisateur puis faire l'acyion selon le choix 
                    while (choix != 1 && choix != 2 && choix != 3) {
                        System.out.println("Error : Merci de Saisir un chiffre soit 1, 2 et 3");
                        System.out.println();
                        choix = sc.nextInt();
                    }
                    switch (choix) {
                        case 1:
                            try {
                                myBedroom.AllumerLumiere();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myBedroom.finalize();
                            }
                            break;

                        case 2:
                            try {
                                myBedroom.EteintLumiere();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myBedroom.finalize();
                            }
                            break;

                        case 3:
                            myBedroom.ChangerEtatClimatiseur();
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:

                    f.MenuCuisine();
                    choix = sc.nextInt();
                    while (choix != 1 && choix != 2 && choix != 3 && choix != 4) {
                        System.out.println("Error : Merci de Saisir un chiffre soit 1, 2 , 3 ou 4");
                        System.out.println();
                        choix = sc.nextInt();
                    }
                    switch (choix) {
                        case 1:
                            try {
                                myKitchen.AllumerFour();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myKitchen.finalize();
                            }
                            break;

                        case 2:
                            try {
                                myKitchen.EteintFour();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myKitchen.finalize();
                            }
                            break;

                        case 3:
                            try {
                                myKitchen.opendoor();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myKitchen.finalize();
                            }
                            break;

                        case 4:
                            try {
                                myKitchen.closedoor();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myKitchen.finalize();
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                case 3:
                    f.MenuGarage();
                    choix = sc.nextInt();
                    while (choix != 1 && choix != 2 && choix != 3) {
                        System.out.println("Error : Merci de Saisir un chiffre soit 1, 2 et 3");
                        System.out.println();
                        choix = sc.nextInt();
                    }
                    switch (choix) {
                        case 1:
                            try {
                                myGarage.OuvrirFenetre();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                myGarage.finalize();
                            }
                            break;

                        case 2:
                            try {
                                myGarage.opendoor();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                System.out.println("Done!");
                                myGarage.finalize();
                            }
                            break;

                        case 3:
                            try {
                                myGarage.lookdoor();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            } finally {
                                System.out.println("Done!");
                                myGarage.finalize();
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                case 4:
                    System.out.print("Merci d'utiliser notre Logiciel");
                    System.out.println();
                    choixRep = 4;
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
