package WODesignPatterns.RoomsFile;

public class RoomsContext {
    //STRATEGY PATTERN
    private Rooms rooms;
    public RoomsContext(Rooms rooms) {this.rooms = rooms;}
    public String executeRooms() {return rooms.getRoomName();}
}
