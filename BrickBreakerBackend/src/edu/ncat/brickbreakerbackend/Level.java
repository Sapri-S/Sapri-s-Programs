/*
Sapri Sise
10/4/2024
Comp 167/ Section 2

Contains an array of brick row objects to from the levels in the game.
*/
package edu.ncat.brickbreakerbackend;

public class Level {
    private int levelNum;
    private BrickRow[] brickRows;
    private int numBrickRows;

//no arg constructor

    public Level() {
        levelNum = 0;
        brickRows = new BrickRow[0];

    }


    /**+
     *
     *
     * @param levelNum
     * @param numBrickRows
     */
    public Level(int levelNum,int numBrickRows) {
        this.levelNum = levelNum;
    // instantiates brickRows
        brickRows = new BrickRow[numBrickRows];
    }



//Getters and setters for Levelnum
    /**+
     * gets the level number
     *
     * @return
     */
    public int getLevelNum() {
        return levelNum;
    }

    /**+
     * sets the level number
     *
     * @param levelNum
     */
    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    /**+
     * Gets the bricks per row
     * @return
     */
    public int getBricksPerRow() {
        return brickRows[0].getBrickMaskLength();
    }

    /**+
     * Geting the number of bricks in a row as an int
     * @return
     */
    public int getNumBrickRows() {
        return brickRows.length;
    }


    /**+
     * Get the brick at an index
     *
     * @param index
     * @return
     */
    public BrickRow getBrickRow(int index) {
        return brickRows[index];

    }

    /**+
     * sets brick at an index
     *
     * @param index
     * @param bkRow
     */
    public void setBrickRow(int index,BrickRow bkRow) {
        brickRows[index] = bkRow;
    }

    @Override
    /**+
     * ToString for this class
     */
    public String toString() {
        StringBuilder modString = new StringBuilder();
        String FinalStr;

        modString.append("Level").append(" " + levelNum+"\n");
        modString.append("Number of BrickRows in this level");

        for(int i = 0; i < brickRows.length; i++) {
            modString.append(i+"\n"+brickRows[i]);
        }

        return modString.toString();
    }
}

