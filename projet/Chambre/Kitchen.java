package projet.Chambre;

public class Kitchen extends Room {

    private boolean OvenStatus;

    Kitchen(String name) {
        super(name);
        OvenStatus = false;
    }

    public boolean getStatusOven() {
        return  OvenStatus;
    }

    public void AllumerFour() {
        if (OvenStatus == false) {
            OvenStatus = true;
            System.out.println(" le four est t'allumer avec success");
        } else {
            System.out.println(" le four est deja allumer ");
        }
    }

    @Override
    public void closedoor() {
        if (isOpen() == true) {
            System.out.println(" fermeture de la porte de est reussi ");
        } else {
            System.out.println(" La porte est deja ferme");
        }
    }

}
