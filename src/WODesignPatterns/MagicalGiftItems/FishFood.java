package WODesignPatterns.MagicalGiftItems;

import WODesignPatterns.MainPlayer;

public class FishFood implements MagicalGifts{
    String magicalGiftName = "Fishy Food";
    String magicalGiftStory = "help feed the hungry Gurgling Fish so they will lead you to the Oger's cave.";
    int coins = 25;

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

