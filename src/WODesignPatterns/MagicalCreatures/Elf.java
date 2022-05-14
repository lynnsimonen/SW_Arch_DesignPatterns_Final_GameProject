package WODesignPatterns.MagicalCreatures;

import WODesignPatterns.MagicalGiftItems.ElfenHammer;
import WODesignPatterns.MagicalGiftItems.MagicalGifts;

public class Elf implements Creatures {
    private MagicalGifts giftType = new ElfenHammer();                          //component property
    private String creatureName = "Elf";
    private String creatureStory = "The elves are industrious and friendly little people.  Since you asked so nicely,\n" +
            "they are glad to hand over one of their extra hammers to you.  You put it into your backpack.";

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
    public String getGiftName() {
        return giftType.getMagicalGiftName();
    }

    @Override
    public MagicalGifts getGiftType() {
        return giftType;
    }

}
