package projet.Chambre;

public class Kitchen extends Room {

    private boolean OvenStatus;

    Kitchen(String name) {
        super(name);
        OvenStatus = false;
    }

    public boolean getStatusOven() {
        return OvenStatus;
    }

    public void AllumerFour() {
        if (OvenStatus == false) {
            OvenStatus = true;
            System.out.println("Le four est t'allumer avec success");
        } else {
            throw new IllegalArgumentException("Le four est deja allumer ");
        }
    }

    public void EteintFour() {
        if (OvenStatus == true) {
            OvenStatus = false;
            System.out.println("Le four est eteint avec success");
        } else {
            throw new IllegalArgumentException ("Le four est deja eteint ");
        }
    }

    @Override
    public void closedoor() {
        if (isOpen() == true) {
            setstatusdoor(false);
            System.out.println("Fermeture de la porte du " + getName() + " est reussi ");
        } else {
            throw new IllegalArgumentException ("La porte du " + getName() + " est deja ferme");
        }
    }

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
