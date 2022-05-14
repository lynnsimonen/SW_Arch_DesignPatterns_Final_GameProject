package WODesignPatterns.MagicalGiftItems;

import WODesignPatterns.MainPlayer;

public class ElfenHammer implements MagicalGifts {
    String magicalGiftName = "ElfenHammer";
    String magicalGiftStory = "help you conquer the horrible Cave Oger!  You will need much help!";
    int coins = 50;

    @Override
    public String getMagicalGiftName() {
        return magicalGiftName;
    }
    @Override
    public String getMagicalGiftStory() {
        return magicalGiftStory;
    }

    public int getCoins() { return coins; }
}

