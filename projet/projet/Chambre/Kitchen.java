package projet.Chambre;

public class Kitchen extends Room {

    private boolean OvenStatus;
    
        // constructeur
    /**
     * Constructor for the garage class.
     * 
     * @param name The name of the kitchen.
     */
    Kitchen(String name) {
        super(name);
        OvenStatus = false;
    }
    
    // getters of oven status 
    public boolean getStatusOven() {
        return OvenStatus;
    }
    
    // Fonction to turn on the oven and throw exception if there is an error 
    public void AllumerFour() {
        if (OvenStatus == false) {
            OvenStatus = true;
            System.out.println("Le four est t'allumer avec success");
        } else {
            throw new IllegalArgumentException("Le four est deja allumer ");
        }
    }
    
    // Fonction to turn off the oven and throw exception if there is an error 
    public void EteintFour() {
        if (OvenStatus == true) {
            OvenStatus = false;
            System.out.println("Le four est eteint avec success");
        } else {
            throw new IllegalArgumentException ("Le four est deja eteint ");
        }
    }

    // Overrides the parent class openDoor method
    @Override
    public void closedoor() {
        if (isOpen() == true) {
            setstatusdoor(false);
            System.out.println("Fermeture de la porte du " + getName() + " est reussi ");
        } else {
            throw new IllegalArgumentException ("La porte du " + getName() + " est deja ferme");
        }
    }
    
    // Overrides the parent class closeDoor method 
    @Override
    public void opendoor() {
        if (isOpen() == false) {
            setstatusdoor(true);
            System.out.println("La porte du " + getName() + " est ouvert avec success.");
        } else {
            throw new IllegalArgumentException ("La porte du " + getName() + " est deja ouvert");
        }
    }

    @Override  
    protected void finalize()   
    {   
        System.out.println("Done! Finalize !");   
    }  

}
