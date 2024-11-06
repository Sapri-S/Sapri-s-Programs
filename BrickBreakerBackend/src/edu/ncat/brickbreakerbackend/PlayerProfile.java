/*
Sapri Sise
10/4/2024
Comp 167/ Section 2

Encapsulates player data with their high scores games played and saved games
*/
package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;


public class PlayerProfile {
    //Case-sensitive Game name
    private String name;
    private int numGamesPlayed;
    private int highScore;
    //private ArrayList<String> savedGames;

    /**+
     * no arg constructor
     */
    public PlayerProfile(){
        this.numGamesPlayed = 0;
        this.highScore = 0;
      //  this.savedGames = null;
        this.name = null;
    }

    /**+
     * sets profile name
     *
     * @param name
     */
    public PlayerProfile(String name){
        this.name = name;

    }

    /**+
     * Gets name
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**+
     * Gets name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**+
     * Gets the games played
     *
     * @return
     */
    public int getNumGamesPlayed(){
        return this.numGamesPlayed;
    }

    /**+
     * sets the game played
     *
     * @param numGamesPlayed
     */
    public void setNumGamesPlayed(int numGamesPlayed){
        this.numGamesPlayed = numGamesPlayed;
    }

    /**+
     * Returns high score
     *
     * @return
     */
    public int getHighScore(){
        return this.highScore;
    }

    /**+
     * sets high score
     *
     * @param highScore
     */
    public void setHighScore(int highScore){
        this.highScore = highScore;
    }




    @Override
    public String toString() {
        StringBuilder Saves = null;
        //future implentaion of save files

        //int GameSaves = savedGames.size();
        //int i;
        //for (i=0;i<GameSaves;i++ ){
          //  Saves.append("/n" + savedGames.get(i));
        //}

        return name + "\n" + numGamesPlayed + "\n"+highScore +"\n" + 0;
    }
}
