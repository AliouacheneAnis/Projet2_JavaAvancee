package projet.Chambre;

public class garage extends Room {
    private boolean FenetreStatus;
    private boolean DoorLooked;

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
            System.out.println(" les Fenetres sont ouvertent avec success");
        } else {
            System.out.println(" les Fenetres sont deja allumer ");
        }
    }

    @Override
    public void opendoor() {
        if (isOpen() == false) {
            setstatusdoor(true);
            System.out.println("la porte est ouvert avec success.");
        }else {
            System.out.println("la porte est deja ouvert");
        }
    }


    public void lookdoor() {
            if (getStatusLook() == false) {
                System.out.println("la porte est veroullier avec success");
                setStatusLook(true);
            }else {
            System.out.println("la porte est deja veroullier");}
    }

}
