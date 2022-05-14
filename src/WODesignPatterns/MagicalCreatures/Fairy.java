package WODesignPatterns.MagicalCreatures;

import WODesignPatterns.MagicalGiftItems.ElfenHammer;
import WODesignPatterns.MagicalGiftItems.FairyCanoe;
import WODesignPatterns.MagicalGiftItems.HiddenTreasure;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;
import WODesignPatterns.MainPlayer;

public class Fairy implements Creatures {
    private MagicalGifts giftType = new FairyCanoe();
    private final String creatureName = "Fairy";
    private final String creatureStory = "The fairies are flitting around the meadow by the stream collecting ferns.\n" +
            "The sunlight dapples the green ferns along the ravine.  You notice tiny canoes in the water which seems to be\n" +
            "the only direction to go around here.  Go ask them if they can help you find the Hidden Treasure.";

    @Override
    public String getCreatureName() {
        return creatureName;
    }

    @Override
    public String getCreatureStory() {
        return creatureStory;
    }

    @Override
    public int giveCoins() {
        return giftType.getCoins();
    }

    @Override
    public MagicalGifts getGiftType() {
        return this.giftType;
    }

    @Override
    public String getGiftName() {
        return giftType.getMagicalGiftName();
    }
}