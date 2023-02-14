package projet.Chambre;

// class garage 
public class garage extends Room {
    private boolean FenetreStatus;
    private boolean DoorLooked;

    // constructeur
    /**
     * Constructor for the garage class.
     * 
     * @param name The name of the garage.
     */
    garage(String name) {
        super(name);
        FenetreStatus = false;
        DoorLooked = false;
    }

    /**
     * Returns the window status.
     * 
     * @return The window status.
     */
    public boolean getStatusFenetre() {
        return FenetreStatus;
    }

    /**
     * Gets the door lock status.
     * 
     * @return The door lock status.
     */
    public boolean getStatusLook() {
        return DoorLooked;
    }

    /**
     * Sets the door lock status.
     * 
     * @param status The new door lock status.
     */
    public void setStatusLook(Boolean status) {
        this.DoorLooked = status;
    }

    /**
     * Opens the window.
     * Throws an exception if the window is already opened.
     */
    public void OuvrirFenetre() {
        if (FenetreStatus == false) {
            FenetreStatus = true;
            System.out.println("Les Fenetres sont ouvertent avec success");
        } else {
            throw new IllegalArgumentException("Les Fenetres sont deja ouverte");
        }
    }

    /**
     * Overriden open door method of the Room class to open the door of the garage.
     * Throws an exception if the door is already opened.
     */
    @Override
    public void opendoor() {
        if (isOpen() == false) {
            setstatusdoor(true);
            System.out.println("La porte est ouvert avec success.");
        } else {
            throw new IllegalArgumentException("La porte est deja ouvert");
        }
    }

    /**
     * Locks the door.
     * Throws an exception if the door is already locked.
     */
    public void lookdoor() {
        if (getStatusLook() == false) {
            System.out.println("La porte est veroullier avec success");
            setStatusLook(true);
        } else {
            throw new IllegalArgumentException("La porte est deja veroullier");
        }
    }

    // finalize method from object class
    @Override
    protected void finalize() {
        System.out.println("Done! Finalize !");
    }

}
