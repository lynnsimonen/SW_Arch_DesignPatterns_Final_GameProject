package WODesignPatterns;

import WODesignPatterns.MagicalGiftItems.HiddenTreasure;
import WODesignPatterns.MagicalGiftItems.MagicalGiftsContext;
import WODesignPatterns.RoomsFile.*;

import java.util.Scanner;

public class GamePlay {
    //Singleton Design Pattern
    private static Scanner keyboard = new Scanner(System.in);
    private static GamePlay gamePlay = new GamePlay();

    private GamePlay() {
    }

    public static GamePlay getInstance() {
        return gamePlay;
    }

    public static void startGame() {            //<------------------------------------------------ startGame()
        MainPlayer mainPlayer = new MainPlayer();
        Rooms newRoom = new RavineRoom();
        String response = "";
        do {
            try {
                System.out.println("\nWould you like to play an adventure game?\n" +
                        "Find the Hidden Treasure to exit to the Rainbow World!!!" +
                        "The Horrible Oger has the treasure but you can win it from him!" +
                        "You will be given instructions as you travel along.\n\n" +
                        "PLAY - If you'd like to explore\n" +
                        "END - If you'd like to stop.\n" +
                        "_________________________________\n\n" +
                        "What would you like to do?: ");
                response = keyboard.next();
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (!(response.toUpperCase().equals("PLAY")) &&
                !(response.toUpperCase().equals("END")));
        if (response.toUpperCase().equals("PLAY")) {
            System.out.println("What is your player's name?: ");
            String playerName = "";
            do {
                try {
                    playerName = keyboard.next();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            while (response == null);

            mainPlayer.setName(playerName);
            System.out.println("\n" + mainPlayer.getName() +
                    ", you are now entering the adventure game.\n");
            moves();
            System.out.println(newRoom.getRoomStory());
            //newRoom.
            chooseMove(mainPlayer, newRoom);        // <------------------------------------------------- CHOOSE MOVE!
            //interact with room until exit to new room
        } else if (response.toUpperCase().equals("END")) {
            System.out.println("Okay, we'll play another time.  Farewell.");
        }
    }

    private static void chooseMove(MainPlayer mainPlayer, Rooms newRoom) {
        boolean chooseAgain = Boolean.parseBoolean(null);
        String choice = "";
        String roomAccess = "";
        String roomAction = "";
        do {
            do {
                try {
                    System.out.println("\nPLEASE CHOOSE A MOVE >>> ");
                    choice = keyboard.next();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (!(choice.toUpperCase().equals("X")) && !(choice.toUpperCase().equals("Z"))
                    && !(choice.toUpperCase().equals("N")) && !(choice.toUpperCase().equals("S"))
                    && !(choice.toUpperCase().equals("E")) && !(choice.toUpperCase().equals("W")));

            if (choice.equalsIgnoreCase("Z")) {
                if (mainPlayer.backPack.contains(newRoom.getMagicalGiftName())) {
                    System.out.println(newRoom.getRoomName() + ":");
                    System.out.println("***  You have already gained the  " + newRoom.getMagicalGiftName() + " from the "
                            + newRoom.getRoomName() + "!  *** \n" +
                            "Move on to the next room to find out what's going on.\n");
                } else {
                    System.out.println("Listen to the " + newRoom.getCreatureName() + " story:\n");
                    System.out.println(newRoom.listenToCreature());
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Congratulations!  The " + newRoom.getCreatureName() + " gave you the " + newRoom.getMagicalGiftName() + "!\n");
                    System.out.println("Room: " + newRoom.getRoomName());
                    mainPlayer.setCoins(newRoom.addCoins());
                    mainPlayer.setBackPack(newRoom.getMagicalGiftType());
                }
                mainPlayer.playerSummary();
                chooseAgain = true;
            } else {
                if (choice.equalsIgnoreCase("N")) {
                    roomAccess = newRoom.north();
                } else if (choice.equalsIgnoreCase("S")) {
                    roomAccess = newRoom.south();
                } else if (choice.equalsIgnoreCase("E")) {
                    roomAccess = newRoom.east();
                } else if (choice.equalsIgnoreCase("W")) {
                    roomAccess = newRoom.west();
                }
                if (roomAccess.equalsIgnoreCase("no")) {
                    System.out.println("There is no passage this way.  Try another direction.");
                    chooseAgain = true;
                } else if (roomAccess.equalsIgnoreCase("maybe")) {
                    MagicalGiftsContext magicalGiftsContext = new MagicalGiftsContext(new HiddenTreasure());
                    //STRATEGY PATTERN!!!
                    //"Hidden Treasure"
                    if (mainPlayer.backPack.contains(magicalGiftsContext.executeMagicalGifts())) {
                        System.out.println("You won!  You have the key to the rainbow room!");
                        mainPlayer.playerSummary();
                        chooseAgain = false;
                    } else {
                        System.out.println("There is no exit without the Hidden Treasure.  " +
                                "Continue searching!");
                        chooseAgain = true;
                    }
                } else {
                    if (roomAccess.equalsIgnoreCase("forest")) {
                        newRoom = new ForestRoom();
                    } else if (roomAccess.equalsIgnoreCase("ravine")) {
                        newRoom = new RavineRoom();
                    } else if (roomAccess.equalsIgnoreCase("tunnel")) {
                        newRoom = new TunnelRoom();
                    } else if (roomAccess.equalsIgnoreCase("cave")) {
                        newRoom = new CaveRoom();
                    }
                    System.out.println("Room: " + newRoom.getRoomName());
                    System.out.println(newRoom.getRoomStory());
                    chooseAgain = true;
                }
            }
            if (choice.equalsIgnoreCase("X")) {
                chooseAgain = true;
                System.out.println("\n\n  Fare thee well!!!\n\n  -- GAME OVER --");
                System.exit(0);
            }
        } while (chooseAgain);
        System.out.println("   ---  GAME OVER  ---   ");
    }

    private static void moves() {

        System.out.println("POSSIBLE MOVES:\n" +
                "N = Move your player North                     Z = *** Interact with Creature in room ***\n" +
                "S = Move your player South                     X = Exit Game\n" +
                "W = Move your player West\n" +
                "E = Move your player East");


    }

}

