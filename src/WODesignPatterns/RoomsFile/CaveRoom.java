package WODesignPatterns.RoomsFile;

import WODesignPatterns.MagicalCreatures.CreatureFactory;
import WODesignPatterns.MagicalCreatures.Creatures;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;

public class CaveRoom implements Rooms {
    //FACTORY FOR CREATURES!!!
    private Creatures creatureType = CreatureFactory.GetCreature("Oger");
    private String roomName = "Cave Room";
    private String roomStory = "Welcome to the Cave Room.  It is dark, cold and damp here.  Also, you can hear \n" +
            "the stomping of a large animal nearby.  You are fearful.  You take out your torch and see that the noise is coming\n" +
            "from a large Oger stomping around and moving logs into a pile.  He snarls at you.  But you mention what a beautiful home he has.\n" +
            "He asks if you'd like one of his homebrews and suggests a game of Hammerschlagen which sounds fun, so you agree.\n" +
            "Play Hammerschlagen with the Oger! (Z - Interact with the Oger and win the Hidden Treasure).\n";
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
        String roomAction = "no";
        return roomAction;
    }

    @Override
    public String south() {
        String roomAction = "tunnel";
        return roomAction;
    }

    @Override
    public String east() {
        String roomAction = "no";
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
        Rooms newRoom = new CaveRoom();
        return new CaveRoom();
    }
}
