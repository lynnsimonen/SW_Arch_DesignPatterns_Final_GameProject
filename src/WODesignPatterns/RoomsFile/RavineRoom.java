package WODesignPatterns.RoomsFile;

import WODesignPatterns.MagicalCreatures.CreatureFactory;
import WODesignPatterns.MagicalCreatures.Creatures;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;

public class RavineRoom implements Rooms, RoomStrategy {
    //FACTORY FOR CREATURES!!!
    private Creatures creatureType = CreatureFactory.GetCreature("Fairy");
    private String roomName = "Ravine Room";
    private String roomStory = "\nWelcome to the Ravine Room.  \n\n" +
            "This is a very serene room with a trickling stream that flows to the tunnel and into the cave.\n" +
            "Inside this room, you will see many small fairy creatures collecting ferns by the water.\n" +
            "Quietly approach one of the fairies and ask if you can use one of their leaf canoes.\n" +
            "They are very small but if they share their ferns with you,\n" +
            "you will shrink to the perfect size to use the canoe.  Ask them for a canoe (Z - Interact with the Fairies).\n";

    @Override
    public String getRoomName() {
        return roomName;
    }
    @Override
    public String getRoomStory() {
        return roomStory;
    }
    @Override
    public String getCreatureName() {return creatureType.getCreatureName();}
    @Override
    public String getMagicalGiftName() { return creatureType.getGiftName();}
    @Override
    public MagicalGifts getMagicalGiftType() { return creatureType.getGiftType(); }

    @Override
    public String north() {
        String roomAction = "forest";
        return roomAction;
    }

    @Override
    public String south() {
        String roomAction = "no";
        return roomAction;
    }

    @Override
    public String east() {
        String roomAction = "tunnel";
        return roomAction;
    }
    @Override
    public String west() {
        String roomAction = "no";
        return roomAction;
    }

    //-------------------------------------------------

    @Override
    public int addCoins(){
        return creatureType.giveCoins();
    }
    @Override
    public String listenToCreature(){
        return creatureType.getCreatureStory();
    }

    @Override
    public Rooms newRoom() {
        Rooms newRoom = new RavineRoom();
        return new RavineRoom();
    }
}
