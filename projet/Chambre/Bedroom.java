package projet.Chambre;

public class Bedroom extends Room {

    private boolean lights;
    private boolean Climatiseur;


    Bedroom(String name) {
        super(name);
        lights = false;
        Climatiseur = false;
    }
    
    public boolean getStatusLights() {
        return lights;
    }

    public boolean getStatusClim() {
        return Climatiseur;
    }

    @Override
    public void AllumerLumiere() {
        if (lights == false) {
            lights = true;
            System.out.println(" les Lumieres allumer avec success");
        } else {
            System.out.println(" les Lumieres sont deja allumer ");
        }
    }

    public void ChangerEtatClimatiseur() {
        Climatiseur = !Climatiseur;
        System.out.println(" Status Climatiseur change. status: " + (Climatiseur ? "ON" : "OFF"));
    }

}
