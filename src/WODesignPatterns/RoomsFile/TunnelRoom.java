package WODesignPatterns.RoomsFile;

import WODesignPatterns.MagicalCreatures.*;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;

public class TunnelRoom implements Rooms {
    //FACTORY FOR CREATURES!!!
    private Creatures creatureType = CreatureFactory.GetCreature("GurglingFish");
    private String roomName = "Tunnel Room";
    private String roomStory = "Welcome to the Tunnel Room! It is dark and serene.  You see glowing fish beneath the\n" +
        "water's surface.  They are beautiful.  These are the Gurgling Fish that you've heard about.  They gurgle stories.  \n" +
                "If you feed them, you will hear how to find the location of the hidden treasure.  Would you like to find the hidden treasure?\n" +
            "Would you like to feed the fish? (Z - Interact with the fish).\n";

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
        String roomAction = "cave";
        return roomAction;
    }

    @Override
    public String south() {
        String roomAction = "no";
        return roomAction;
    }

    @Override
    public String east() {
        String roomAction = "no";
        return roomAction;
    }
    @Override
    public String west() {
        String roomAction = "ravine";
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
        Rooms newRoom = new TunnelRoom();
        return new TunnelRoom();
    }
}
