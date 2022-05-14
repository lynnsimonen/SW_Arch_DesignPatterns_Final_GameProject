package WODesignPatterns.MagicalGiftItems;

import WODesignPatterns.MainPlayer;

public class FairyCanoe implements MagicalGifts{
    String magicalGiftName = "Fairy Canoe";
    String magicalGiftStory = "help you get to the Oger's cave and, hopefully, get the Hidden Treasure." +
            "There are Fairy Ferns in the bow of the canoe that when eaten will shrink you to the size" +
            "of the boat.  No worries, you'll regain your original size when done with canoe.";
    int coins = 75;

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

