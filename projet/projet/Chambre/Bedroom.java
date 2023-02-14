package projet.Chambre;

// class Bedroom 
public class Bedroom extends Room {

    private boolean lights;
    private boolean Climatiseur;

    // constructeur
    Bedroom(String name) {
        super(name);
        lights = false;
        Climatiseur = false;
    }

    // getters
    public boolean getStatusLights() {
        return lights;
    }

    public boolean getStatusClim() {
        return Climatiseur;
    }

    // Override la fonction dans la classe mere utiliser pour allumer les lumiere
    @Override
    public void AllumerLumiere() {
        if (lights == false) {
            lights = true;
            System.out.println("Les Lumieres allumer avec success");
        } else {
            // throw une exception en cas d'erreur
            throw new IllegalArgumentException("Les Lumieres sont deja allumer");
        }
    }

    // Override la fonction dans la classe mere utiliser pour Eteindre les lumiere
    @Override
    public void EteintLumiere() {
        if (lights == true) {
            lights = false;
            System.out.println("Les Lumieres de la " + getName() + " sont Eteint avec success");
        } else {
            // throw une exception en cas d'erreur
            throw new IllegalArgumentException("Les Lumieres de la " + getName() + " sont deja Eteint ");
        }
    }

    // Fonction pour changer ou switch l'etat de climatiseur
    public void ChangerEtatClimatiseur() {
        Climatiseur = !Climatiseur;
        System.out.println("Status Climatiseur change. status: " + (Climatiseur ? "ON" : "OFF"));
    }

    // fonction finalize de la class objet afin de libirer l'espace
    @Override
    protected void finalize() {
        System.out.println("Done! Finalize !");
    }

}
