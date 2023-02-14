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
        System.out.println(name + " has been opened.");
    }

    public void closedoor() {
        DoorStatus = false;
        System.out.println(name + " has been closed.");
    }

    public void AllumerLumiere() {
        System.out.println(" les Lumieres allumer avec success");
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