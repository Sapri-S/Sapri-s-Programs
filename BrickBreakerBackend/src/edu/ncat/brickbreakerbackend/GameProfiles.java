/*
Sapri Sise
10/4/2024
Comp 167/ Section 2


Manges the player profiles
*/


package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;

public class GameProfiles extends PlayerProfile {
    private PlayerProfile selectedProfile;
    private PlayerProfile highGameProfile;
    private ArrayList<PlayerProfile> playerProfiles;
    private String profileFileName;

    /**
     * default no arg constructor
     */
    public GameProfiles() {
        selectedProfile = null;
        highGameProfile = null;
        playerProfiles = new ArrayList<>();
        profileFileName = null;
    }

    /**
     * gets the selected profile
     * @return
     */
    public PlayerProfile getSelectedProfile() {
        return selectedProfile;
    }

    /**
     * returns player with high score
     * @return
     */
    public PlayerProfile getHighGameProfile() {
        return highGameProfile;
    }

    /**
     * sets the player with the high score
     * @param prof
     */
    public void setHighGameProfile(PlayerProfile prof) {
        highGameProfile = prof;
    }

    /**
     * returns profile file name
     * @return
     */
    public String getProfileFilename() {
        return profileFileName;
    }

    /**
     * sets profile file name
     * @param fname
     */
    public void setProfileFilename(String fname) {
        profileFileName = fname;
    }


    /**
     * retunrs the number of players
     * @return
     */
    // Array Handling-------
    public int getNumPlayerProfiles() {
        return playerProfiles.size();
    }

    /**
     * gets player at an index
     * @param index
     * @return
     */
    public PlayerProfile getPlayerProfile(int index) {
        return playerProfiles.get(index);
    }


    /**
     * Sets player profile
     *
     * @param index
     * @param prof
     */
    public void setPlayerProfile(int index, PlayerProfile prof) {
        playerProfiles.set(index, prof);
    }

    // adding new player profiles objects to the playerprofile list

    /**
     * adds player profile
     *
     * @param pfile
     */
    public void addPlayerProfile(PlayerProfile pfile) {
        playerProfiles.add(pfile);
    }

    /**
     * removes player profile
     * @param index
     * @return
     */
    public PlayerProfile deletePlayerProfile(int index) {
        return playerProfiles.remove(index);
    }

    /**
     * sets selected profile
     *
     * @param pfile
     */
    public void setSelectedProfile(PlayerProfile pfile) {
        selectedProfile = pfile;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(selectedProfile.toString()+"\n"+highGameProfile.toString()+"\n"+playerProfiles.toString()+"\n");
        return (str.toString());
    }
}
