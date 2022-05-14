package WODesignPatterns.RoomsFile;

import WODesignPatterns.MagicalCreatures.CreatureFactory;
import WODesignPatterns.MagicalCreatures.Creatures;
import WODesignPatterns.MagicalCreatures.Elf;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;

public class ForestRoom implements Rooms {
    //FACTORY FOR CREATURES!!!
    //private Creatures creatureType = CreatureFactory.GetCreature("Elf");            //component property
    private Creatures creatureType = new Elf();
    private String roomName = "Forest Room";
    private String roomStory = "Welcome to the Forest Room.  You fell into a beautiful forest full of majestic pines and industrious little elves!\n" +
            "The little elves are building new homes with their hammers that have the strength of 10 little elves!\n" +
            "These hammers could also be helpful for your journey.  Ask them for a hammer (Z - Interact with the Elves).\n";

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
        String roomAction = "maybe";
        return roomAction;
    }

    @Override
    public String south() {
        String roomAction = "ravine";
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
    public int addCoins() {
        return creatureType.giveCoins();
    }
    @Override
    public String listenToCreature(){
        return creatureType.getCreatureStory();
    }
    @Override
    public Rooms newRoom() {
        Rooms newRoom = new ForestRoom();
        return new ForestRoom();
    }
}
