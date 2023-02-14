package projet.Chambre;

public class Room {

    private String name;
    private boolean DoorStatus;

    // constructor to initialize the name of the room and set the door status to
    // false (closed)
    public Room(String name) {
        this.name = name;
        this.DoorStatus = false;
    }

    // getters
    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return DoorStatus;
    }

    // setters
    public void setstatusdoor(boolean status) {
        this.DoorStatus = status;
    }

    // method to open the door
    public void opendoor() {
        DoorStatus = true;
        System.out.println(name + " c'est ouvert.");
    }

    // method to close the door
    public void closedoor() {
        DoorStatus = false;
        System.out.println(name + " c'est ferme.");
    }

    // method to turn on the light
    public void AllumerLumiere() {
        System.out.println("Les Lumieres allumer avec success");
    }

    // method to turn of the light
    public void EteintLumiere() {
        System.out.println("Les Lumieres sont Eteint avec success");
    }

}