package WODesignPatterns.MagicalCreatures;

import WODesignPatterns.MagicalGiftItems.ElfenHammer;
import WODesignPatterns.MagicalGiftItems.HiddenTreasure;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;
import WODesignPatterns.MainPlayer;

public class Oger implements Creatures {
    private MagicalGifts giftType = new HiddenTreasure();
    private String creatureName = "Oger";
    private String creatureStory = "The Oger is big, grumpy and bored.  He doesn't know it, but he enjoys\n" +
            "hanging out with friends.  Show him what fun you are!  Offer to play Hammerschlagen with him!\n" +
            "There's a big old tree stump over by his hut.  See if he will share some of his homebrew\n" +
            "and join you in a game or two...";

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
