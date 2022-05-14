package WODesignPatterns.MagicalGiftItems;

import WODesignPatterns.MagicalCreatures.Creatures;
//STRATEGY PATTERN
public class MagicalGiftsContext {
    private MagicalGifts magicalGifts;

    public MagicalGiftsContext(MagicalGifts magicalGifts) {
        this.magicalGifts = magicalGifts;
    }

    public String executeMagicalGifts() {
        return magicalGifts.getMagicalGiftName();
    }
}
