package WODesignPatterns.MagicalCreatures;

public class CreatureFactory {
    public static Creatures GetCreature(String creatureType) {

        switch (creatureType) {
            case "Elf":
                return new Elf();   //Usually use Enums for this
            case "Oger":
                return new Oger();
            case "Fairy":
                return new Fairy();
            case "GurglingFish":
                return new GurglingFish();
        }
        return null;
    }
}
