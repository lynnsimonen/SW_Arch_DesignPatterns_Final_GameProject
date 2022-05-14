package WODesignPatterns.MagicalGiftItems;

import WODesignPatterns.MainPlayer;

public class HiddenTreasure implements MagicalGifts {
    String magicalGiftName = "Hidden Treasure";
    String magicalGiftStory = "help you exit the Forest and enter into the sunlit land of rainbows!\n" +
            "Now go back to the Forest and find the exit that leads to the rainbows!";
    int coins = 200;

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

