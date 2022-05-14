package WODesignPatterns;

import WODesignPatterns.MagicalGiftItems.MagicalGifts;

import java.util.ArrayList;

public class MainPlayer {
    private int coins;
    private String name;
    public ArrayList<String> backPack = new ArrayList<>();    // = new ArrayList<>();

    public MainPlayer() {
//        this.name = name;
//        this.coins = coins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCoins(int newCoins) {
        coins += newCoins;
    }

    public int getCoins() {
        return coins;
    }

    public String listBackPack() {
        String inBackPack = "";
        for (String item : backPack) {
            inBackPack += " -" + item;
        }
        return "The contents in your backpack are: " + inBackPack;
    }

    public void setBackPack(MagicalGifts magicalGifts) {
        backPack.add(magicalGifts.getMagicalGiftName());
    }

    public void playerSummary() {
        System.out.println(getName() + ", here are your game stats: \n----------------------------------------------");
        System.out.println("Your total coins: " + getCoins());
        System.out.println(listBackPack());
    }
}
