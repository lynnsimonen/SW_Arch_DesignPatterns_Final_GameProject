package WODesignPatterns.MagicalCreatures;

import WODesignPatterns.MagicalGiftItems.MagicalGifts;

import java.util.ArrayList;

public interface Creatures {
    MagicalGifts giftType = null;
    String creatureName = "";
    String creatureStory = "";

    String getCreatureName();
    String getCreatureStory();
    public int giveCoins();
    public String getGiftName();
    public MagicalGifts getGiftType();
}


