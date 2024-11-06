/*
Sapri Sise
10/4/2024
Comp 167/ Section 2


*/

// import modules
package edu.ncat.brickbreakerbackend;
import java.io.FileWriter;
import javafx.scene.paint.Color;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//
public class BrickBreakerIO {
    public static Level[] readConfigFile(String cFileName) {
        // make the level list obj to be filled and returned
        Level[] lvls = null;

        try {
            // instantiate tools to read from files
            FileReader reader = new FileReader(cFileName);
            Scanner scanner = new Scanner(reader);
            //Getting the first int and new line charter to avoid issues later
            String numLevels = scanner.nextLine();
            int numLevel = Integer.parseInt(numLevels);
            lvls = new Level[numLevel];
            //iterating for every level
            for (int i = 0; i < numLevel; ++i) {
                int level = scanner.nextInt();

                int numBrickRowsInLvl = scanner.nextInt();

                //creating the new level object
                Level lvl = new Level(level, numBrickRowsInLvl);
// I have other comments her on different ways to do this that I had previously tried that didnt work for me but could work
//BrickRow Brows = new BrickRow();
//Brows.setColor(color);
//Brows.setPointValue(scanner.nextInt());
//Brows.setBrickMask(scanner.next());
                for (int j = 0; j < numBrickRowsInLvl; ++j) {

                    int bRow = scanner.nextInt();
                    Color color = new Color(scanner.nextInt()/255.0, scanner.nextInt()/255.0, scanner.nextInt()/255.0,1.0);

                    int points = scanner.nextInt();

                    String bMask = scanner.next();

                    //adding all values to a new brickrow object
                    BrickRow Brows = new BrickRow(points,color,bMask);

                    //adding object to the level at the index
                    lvl.setBrickRow(j, Brows);
                }
                //adding the levels to returning array
                lvls[i] = lvl;
            }
        } catch (FileNotFoundException e) {;
       }

        return lvls;
    }


    public static void readProfiles(GameProfiles gmProf, String fname) {
        try {
            //File reading tools from the file
            FileReader reader = new FileReader(fname);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                // getting every instance of a player
                PlayerProfile pp = new PlayerProfile(scanner.next());
                pp.setNumGamesPlayed(scanner.nextInt());
                pp.setHighScore(scanner.nextInt());
                int numSavedGames = scanner.nextInt();


                //getting all saves
                for (int i = 0; i < numSavedGames; i++) {
                    String Saves = scanner.nextLine();
                }


                gmProf.addPlayerProfile(pp);
            }
        } catch (FileNotFoundException e) {}
    }


    public static void writeProfiles(GameProfiles gmProf, String fname){
        int i=0;
        int profiles = gmProf.getNumPlayerProfiles();

        try {
            FileWriter writer = new FileWriter(fname, true);
            for (i = 0; i < profiles; i++) {
                //Writes every profile to the out file
                PlayerProfile profile = gmProf.getPlayerProfile(i);
                writer.write(profile.getName() + "\n");
                writer.write(profile.getNumGamesPlayed() + "\n");
                writer.write(profile.getHighScore() + "\n");
                writer.write(0);
            }
        }
        catch (IOException e) {

        }


    }

    public static void saveGame(){

    }

    public static void saveGames(){

    }

}

