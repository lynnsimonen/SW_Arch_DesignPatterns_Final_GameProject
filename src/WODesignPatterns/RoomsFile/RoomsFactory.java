package WODesignPatterns.RoomsFile;

public class RoomsFactory {
    public Rooms RoomsCreation(String whichRoom) {
        Rooms rooms;
        if (whichRoom == null || whichRoom.isEmpty())
            return null;
        switch (whichRoom) {
            case "forest":
                return rooms = new ForestRoom();
            case "cave":
                return rooms = new CaveRoom();
            case "tunnel":
                return rooms = new TunnelRoom();
            case "ravine":
                return rooms = new RavineRoom();
            default:
                throw new IllegalArgumentException("Unknown room: " + whichRoom);
        }
    }
}
