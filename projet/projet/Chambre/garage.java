package projet.Chambre;

// class garage 
public class garage extends Room {
    private boolean FenetreStatus;
    private boolean DoorLooked;

    // constructeur 
    garage(String name) {
        super(name);
        FenetreStatus = false;
        DoorLooked = false;
    }
    
    
    public boolean getStatusFenetre() {
        return FenetreStatus;
    }

    public boolean getStatusLook() {
        return DoorLooked;
    }

    public void setStatusLook(Boolean status) {
        this.DoorLooked = status;
    }

    public void OuvrirFenetre() {
        if (FenetreStatus == false) {
            FenetreStatus = true;
            System.out.println("Les Fenetres sont ouvertent avec success");
        } else {
            throw new IllegalArgumentException ("Les Fenetres sont deja ouverte");
        }
    }

    @Override
    public void opendoor() {
        if (isOpen() == false) {
            setstatusdoor(true);
            System.out.println("La porte est ouvert avec success.");
        } else {
            throw new IllegalArgumentException ("La porte est deja ouvert");
        }
    }

    public void lookdoor() {
        if (getStatusLook() == false) {
            System.out.println("La porte est veroullier avec success");
            setStatusLook(true);
        } else {
            throw new IllegalArgumentException ("La porte est deja veroullier");
        }
    }

    @Override  
    protected void finalize()   
    {   
        System.out.println("Done! Finalize !");   
    }  

}
