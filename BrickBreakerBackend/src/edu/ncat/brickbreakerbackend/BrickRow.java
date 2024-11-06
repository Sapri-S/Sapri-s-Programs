/*
Sapri Sise
10/4/2024
Comp 167/ Section 2

Makes a single row of bricks for visible and hidden rows
*/
package edu.ncat.brickbreakerbackend;
import java.util.ArrayList;

import javafx.scene.paint.Color;

import java.util.Scanner;


public class BrickRow {
    //encapsulated fields
    private int pointValue;
    private Color color;
    private Boolean[] brickMask;

    /**
     * Brick Row Constructor
     * Sets all to java default
     */
    //setting all values to default
    public BrickRow() {
        this.pointValue = 0;
        this.color =Color.BLACK;
        this.brickMask = null;
    }

    /**+
     * Brick Row Constructor
     * @param ptVal
     * @param clr
     * @param bMask
     */

    public BrickRow(int ptVal, Color clr, String bMask) {
        this.pointValue = ptVal;
        this.color = clr;
        this.brickMask = new Boolean[bMask.length()];
        int i;
        //turns string into an array
        char[] bmaskArray = bMask.toCharArray();
        //sets brickmask boolean value at each index
        for (i=0; i<bmaskArray.length; i++) {
            if (bmaskArray[i] == '1') {
                brickMask[i] = true;
            }else if (bmaskArray[i] == '0') {
                brickMask[i] = false;
            }
        }





    }

    /**+
     *Returns brick mask value at an index
     *
     * @param index
     * @return
     */
    public boolean getBrickMaskValue(int index){

        return brickMask[index];


    }

    /**+
     *changes brick mask val at an index
     *
     * @param index
     * @param value
     */
    public void setBrickMaskValue(int index, boolean value) {
        this.brickMask[index] = value;


    }

    /**+
     * Makes brick mask val at an index
     *
     * @param Bmask
     */
    public void setBrickMask(String Bmask){
        int i;
        char[] bmaskArray = Bmask.toCharArray();

        for (i=0; i<bmaskArray.length; i++) {
            if (bmaskArray[i] == '1') {
                brickMask[i] = true;
            }else if (bmaskArray[i] == '0') {
                brickMask[i] = false;
            }
        }
    }

    /**+
     *Retuns brickMask length as an int
     * @return
     */
    public int getBrickMaskLength() {
        return brickMask.length;
    }


    /**+
     *returns  the toString
     * @return a string
     */
    @Override
    public String toString() {
        StringBuilder maskStr = new StringBuilder();
        for (boolean b : brickMask) {
            maskStr.append(b ? "1" : "0");
        }
        return pointValue + "\n" + (int)(color.getRed() * 255) + " " + (int)(color.getGreen() * 255) + " " + (int)(color.getBlue() * 255) + "\n" + maskStr.toString();
    }

    /**+
     * Gets point value
     * @return
     */
    public int getPointValue() {
        return pointValue;
    }


    /**+
     * Sets point value
     *
     * @param pointValue
     */
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    /**+
     * Gets color
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**+
     * sets color
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }


}
