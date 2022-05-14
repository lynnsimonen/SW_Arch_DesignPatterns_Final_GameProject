package WODesignPatterns.RoomsFile;

import WODesignPatterns.MagicalCreatures.Creatures;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;
import WODesignPatterns.MainPlayer;

public interface Rooms {
    Creatures creatureType = null;
    String roomName = "";
    String roomStory = "";

    public String getRoomName();
    public String getRoomStory();
    public String getCreatureName();
    public String getMagicalGiftName();
    public MagicalGifts getMagicalGiftType();
    public String north();
    public String south();
    public String east();
    public String west();

    public int addCoins();
    public String listenToCreature();
    public Rooms newRoom();
}





