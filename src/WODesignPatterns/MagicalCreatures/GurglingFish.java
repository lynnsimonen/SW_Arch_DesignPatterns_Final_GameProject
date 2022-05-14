package WODesignPatterns.MagicalCreatures;

import WODesignPatterns.MagicalGiftItems.*;
import WODesignPatterns.MainPlayer;

public class GurglingFish implements Creatures {
    private MagicalGifts giftType = new FishFood();
    private String creatureName = "Gurgling Fish";
    private String creatureStory = "The Gurgling Fish are chubby little iridescent guys that \n" +
            "gurgle up at the surface when feeding.  Once fed, their gurgles can be understood." +
            "and will give you directions to the Oger's cave.";

    @Override
    public String getCreatureName() { return creatureName; }

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