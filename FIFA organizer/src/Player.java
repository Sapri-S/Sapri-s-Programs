import java.util.ArrayList;

public class Player {
    // all need
    protected int rank;
    protected String name;
    protected int overall;
    protected int pace;
    protected int shooting;
    protected int dribbling;
    protected int passing;
    protected int defending;
    protected int physicality;
    protected int acceleration;
    protected int sprintSpeed;
    protected int positioning;
    protected int shortPass;
    protected int longPass;
    protected int curve;
    protected int dribbling2;
    protected int agility;
    protected int balance;
    protected int reaction;
    protected int ballControl;
    protected int composure;
    protected int jumping;
    protected int stamina;
    protected int strength;
    protected int Aggression;
    protected int vision;


    protected String position;

    protected Boolean preferredFoot;
    protected String height;
    protected String weight;
    protected ArrayList<String> alternatePosition;
    protected int age;

    protected String nation;
    protected String league;
    protected String Team;
    protected int skillMoves;

    //out of 5
    protected int weakFoot;


    //Attacking
    protected int finishing;
    protected int shotPower;
    protected int longShot;
    protected int volleys;
    protected int crossing;
    protected int freeKick;
    protected int penalty;


    //Defensive stuff
    protected int interception;
    protected int headingAccuracy;
    protected int defAwareness;
    protected int standingTackle;
    protected int slidingTackle;

    //Goal keeping stuff
    // whean reading in make sure to find if has next for these stats
    protected int diving;
    protected int handles;
    protected int goalKicking;
    protected int gkPositioning;
    protected int gkReflexes;


    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPhysicality() {
        return physicality;
    }

    public void setPhysicality(int physicality) {
        this.physicality = physicality;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(int sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public int getShortPass() {
        return shortPass;
    }

    public void setShortPass(int shortPass) {
        this.shortPass = shortPass;
    }

    public int getLongPass() {
        return longPass;
    }

    public void setLongPass(int longPass) {
        this.longPass = longPass;
    }

    public int getCurve() {
        return curve;
    }

    public void setCurve(int curve) {
        this.curve = curve;
    }

    public int getDribbling2() {
        return dribbling2;
    }

    public void setDribbling2(int dribbling2) {
        this.dribbling2 = dribbling2;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public int getBallControl() {
        return ballControl;
    }

    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    public int getComposure() {
        return composure;
    }

    public void setComposure(int composure) {
        this.composure = composure;
    }

    public int getJumping() {
        return jumping;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAggression() {
        return Aggression;
    }

    public void setAggression(int aggression) {
        Aggression = aggression;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(Boolean preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public ArrayList<String> getAlternatePosition() {
        return alternatePosition;
    }

    public void setAlternatePosition(ArrayList<String> alternatePosition) {
        this.alternatePosition = alternatePosition;
    }
    public int numAlternatePosition() {
        return alternatePosition.size();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public int getWeakFoot() {
        return weakFoot;
    }

    public void setWeakFoot(int weakFoot) {
        this.weakFoot = weakFoot;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }

    public int getLongShot() {
        return longShot;
    }

    public void setLongShot(int longShot) {
        this.longShot = longShot;
    }

    public int getVolleys() {
        return volleys;
    }

    public void setVolleys(int volleys) {
        this.volleys = volleys;
    }

    public int getCrossing() {
        return crossing;
    }

    public void setCrossing(int crossing) {
        this.crossing = crossing;
    }

    public int getFreeKick() {
        return freeKick;
    }

    public void setFreeKick(int freeKick) {
        this.freeKick = freeKick;
    }

    public int getInterception() {
        return interception;
    }

    public void setInterception(int interception) {
        this.interception = interception;
    }

    public int getHeadingAccuracy() {
        return headingAccuracy;
    }

    public void setHeadingAccuracy(int headingAccuracy) {
        this.headingAccuracy = headingAccuracy;
    }

    public int getDefAwareness() {
        return defAwareness;
    }

    public void setDefAwareness(int defAwareness) {
        this.defAwareness = defAwareness;
    }

    public int getStandingTackle() {
        return standingTackle;
    }

    public void setStandingTackle(int standingTackle) {
        this.standingTackle = standingTackle;
    }

    public int getSlidingTackle() {
        return slidingTackle;
    }

    public void setSlidingTackle(int slidingTackle) {
        this.slidingTackle = slidingTackle;
    }

    public int getDiving() {
        return diving;
    }

    public void setDiving(int diving) {
        this.diving = diving;
    }

    public int getHandles() {
        return handles;
    }

    public void setHandles(int handles) {
        this.handles = handles;
    }

    public int getGoalKicking() {
        return goalKicking;
    }

    public void setGoalKicking(int goalKicking) {
        this.goalKicking = goalKicking;
    }

    public int getGkPositioning() {
        return gkPositioning;
    }

    public void setGkPositioning(int gkPositioning) {
        this.gkPositioning = gkPositioning;
    }

    public int getGkReflexes() {
        return gkReflexes;
    }

    public void setGkReflexes(int gkReflexes) {
        this.gkReflexes = gkReflexes;
    }


    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getSkillMoves() {
        return skillMoves;
    }

    public void setSkillMoves(int skillMoves) {
        this.skillMoves = skillMoves;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;


    }


//ai used to make toString
    @Override
    public String toString() {
        StringBuilder built = new StringBuilder( name + "," + // Add a placeholder for Unnamed: 0 since it's not in the Player class
                overall + "," +  // OVR
                pace + "," +     // PAC
                shooting + "," + // SHO
                getPassing() + "," +  // PAS (you might need to add this field if missing)
                dribbling + "," + // DRI
                defending + "," + // DEF
                physicality + "," + // PHY
                acceleration + "," + // Acceleration
                sprintSpeed + "," + // Sprint Speed
                positioning + "," + // Positioning
                finishing + "," +   // Finishing
                shotPower + "," +   // Shot Power
                longShot + "," +    // Long Shots
                volleys + "," +     // Volleys
                penalty + "," +    // Add a placeholder for Penalties
                vision +  "," +      // Add a placeholder for Vision
                crossing + "," +    // Crossing
                freeKick + "," +    // Free Kick Accuracy
                shortPass + "," +   // Short Passing
                longPass + "," +    // Long Passing
                curve + "," +       // Curve
                dribbling2 + "," +  // Dribbling
                agility + "," +     // Agility
                balance + "," +     // Balance
                reaction + "," +    // Reactions
                ballControl + "," + // Ball Control
                composure + "," +   // Composure
                interception + "," + // Interceptions
                headingAccuracy + "," + // Heading Accuracy
                defAwareness + "," + // Def Awareness
                standingTackle + "," + // Standing Tackle
                slidingTackle + "," + // Sliding Tackle
                jumping + "," +     // Jumping
                stamina + "," +     // Stamina
                strength + "," +    // Strength
                Aggression + "," +  // Aggression
                position + "," +    // Position
                weakFoot + "," +    // Weak foot
                skillMoves + ","+   // Add a placeholder for Skill moves
                preferredFoot + "," + // Preferred foot
                height + "," +      // Height
                weight + ",");     // Weight
                for (int i = 0 ; i < this.numAlternatePosition(); i++ ){
                    StringBuilder append = built.append(alternatePosition.get(i)).append(",");
                }
                // Alternative positions
                built.append(age + "," +         // Age
                nation + "," +      // Nation
                league + "," +      // League
                Team + "," +        // Team
                diving + "," +      // GK Diving
                handles + "," +     // GK Handling
                goalKicking + "," + // GK Kicking
                gkPositioning + "," + // GK Positioning
                gkReflexes );        // GK Reflexes
        return built.toString();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public void AddAlternatePosition(String alternatePosition) {
        this.alternatePosition.add(alternatePosition);

    }
}


