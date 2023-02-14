package projet.Chambre;

public class Room {

    private String name;
    private boolean DoorStatus;

    public Room(String name) {
        this.name = name;
        this.DoorStatus = false;
    }

    public void opendoor() {
        DoorStatus = true;
        System.out.println(name + " c'est ouvert.");
    }

    public void closedoor() {
        DoorStatus = false;
        System.out.println(name + " c'est ferme.");
    }

    public void AllumerLumiere() {
        System.out.println("Les Lumieres allumer avec success");
    }

    public void EteintLumiere() {
        System.out.println("Les Lumieres sont Eteint avec success");
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return DoorStatus;
    }

    public void setstatusdoor(boolean status) {
        this.DoorStatus = status;
    }
}