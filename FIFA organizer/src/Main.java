import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadAllPlayers("C:\\Users\\sap\\Downloads\\FIFA organizer\\src\\all_players.csv");
    }



    public static ArrayList<Player> ReadAllPlayers(String Fname) throws FileNotFoundException {
        ArrayList<Player> players = new ArrayList<>();

        FileReader reader = new FileReader(Fname);
        Scanner scanner = new Scanner(reader);

        String perameters = scanner.nextLine();
        System.out.println(perameters);

        while (scanner.hasNextLine()) {
            try {
                String PlayerData = scanner.nextLine();
                Player player = new Player();
                String[] data = PlayerData.split(",");
                int numPlayer = Integer.parseInt(data[1]) + 1;
                player.setRank(Integer.parseInt(data[2]));
                player.setName(data[3]);
                player.setOverall(Integer.parseInt(data[4]));
                player.setPace(Integer.parseInt(data[5]));
                player.setShooting(Integer.parseInt(data[6]));
                player.setPassing(Integer.parseInt(data[7]));
                player.setDribbling(Integer.parseInt(data[8]));
                player.setDefending(Integer.parseInt(data[9]));
                player.setPhysicality(Integer.parseInt(data[10]));
                player.setAcceleration(Integer.parseInt(data[11]));
                player.setSprintSpeed(Integer.parseInt(data[12]));
                player.setPositioning(Integer.parseInt(data[13]));
                player.setFinishing(Integer.parseInt(data[14]));
                player.setShotPower(Integer.parseInt(data[15]));
                player.setLongShot(Integer.parseInt(data[16]));
                player.setVolleys(Integer.parseInt(data[17]));
                player.setPenalty(Integer.parseInt(data[18]));
                player.setVision(Integer.parseInt(data[19]));
                player.setCrossing(Integer.parseInt(data[20]));
                player.setFreeKick(Integer.parseInt(data[21]));
                player.setShortPass(Integer.parseInt(data[22]));
                player.setLongPass(Integer.parseInt(data[23]));
                player.setCurve(Integer.parseInt(data[24]));
                player.setDribbling(Integer.parseInt(data[25]));
                player.setAgility(Integer.parseInt(data[26]));
                player.setBalance(Integer.parseInt(data[27]));
                player.setReaction(Integer.parseInt(data[28]));
                player.setBallControl(Integer.parseInt(data[29]));
                player.setComposure(Integer.parseInt(data[30]));
                player.setInterception(Integer.parseInt(data[31]));
                player.setHeadingAccuracy(Integer.parseInt(data[32]));
                player.setDefAwareness(Integer.parseInt(data[33]));
                player.setStandingTackle(Integer.parseInt(data[34]));
                player.setSlidingTackle(Integer.parseInt(data[35]));
                player.setJumping(Integer.parseInt(data[36]));
                player.setStamina(Integer.parseInt(data[37]));
                player.setStrength(Integer.parseInt(data[38]));
                player.setAggression(Integer.parseInt(data[39]));
                //st cdm ect
                player.setPosition(data[40]);
                player.setWeakFoot(Integer.parseInt(data[41]));

                //ture right false left
                if (data[41] == "Left") {
                    player.setPreferredFoot(false);
                } else if (data[41] == "Right") {
                    player.setPreferredFoot(true);
                }
                player.setSkillMoves(Integer.parseInt(data[42]));

                String[] Height = data[43].trim().split("/");
                player.setHeight((Height[0]));
                String[] weight = data[44].trim().split("/");
                player.setWeight((weight[0]));
                //make for while in while read for if
                ArrayList<String> alternate = new ArrayList<>();


                ArrayList<String> alternatePositions = new ArrayList<>();
                for (int i = 46; i < data.length; i++) {
                    if (!data[i].isEmpty() && isPositionValid(data[i])) {
                        alternatePositions.add(data[i]);
                    }
                }
                player.setAlternatePosition(alternatePositions);

                int newIteration = Integer.parseInt(data[46 + alternatePositions.size()]);
                player.setAge(Integer.parseInt(data[46 + alternatePositions.size()]));
                newIteration++;


                player.AddAlternatePosition(String.valueOf(alternate));



                int age;
                player.setAge(Integer.parseInt(data[newIteration]));
                newIteration++;
                player.setNation(data[newIteration]);
                newIteration++;
                player.setLeague(data[newIteration]);
                newIteration++;
                player.setTeam(data[newIteration]);
                newIteration++;
                //GK stats
                player.setDiving(Integer.parseInt(data[newIteration]));
                newIteration++;
                player.setHandles(Integer.parseInt(data[newIteration]));
                newIteration++;
                player.setGoalKicking(Integer.parseInt(data[newIteration]));
                newIteration++;
                player.setGkPositioning(Integer.parseInt(data[newIteration]));
                newIteration++;
                player.setGkReflexes(Integer.parseInt(data[newIteration]));
                System.out.println(player.toString());

            }catch (NumberFormatException e) {

            }














        }


        return players;
    }
    private static boolean isPositionValid(String position) {
        String[] validPositions = {
                "GK", "G", "POR", "TW", "GR", "GOL", "DM", "BR", "KL", "MV",
                "RB", "DD", "LD", "RV", "TD", "RA", "PO", "SGB", "HB",
                "RWB", "DLD", "CAD", "RAV", "LDO", "ADD", "ADA", "RVV", "CPS", "PKO", "SGKB", "HYB",
                "CB", "DC", "DFC", "IV", "ZAG", "CV", "SO", "STP", "MB",
                "LB", "DG", "LI", "LV", "DE", "LE", "TS", "LA", "LO", "SLB", "VB",
                "LWB", "DLG", "CAI", "LAV", "LEO", "ADE", "ASA", "LVV", "CLS", "LKO", "SLKB", "VYB",
                "CDM", "MDC", "MCD", "ZDM", "VOL", "CDC", "CVM", "SPD", "SDZ", "MDO", "CDM",
                "CM", "MC", "ZM", "CC", "SP", "SZ", "MO",
                "CAM", "MOC", "MCO", "ZOM", "MEI", "COC", "SPO", "SOZ", "MOO", "COM",
                "RM", "MD", "ED", "PP", "PZ", "SGO", "HM",
                "RW", "AD", "RF", "PD", "RVA", "PS", "PK", "SGK", "HY",
                "LM", "MG", "MI", "ME", "ES", "LP", "LZ", "SLO", "VM",
                "LW", "AG", "EI", "EE", "PE", "AS", "LVA", "LS", "LK", "SLK", "VY",
                "RF", "AVD", "SDD", "RS", "MAD", "ATD", "RV", "PN", "PU", "SGF", "VF",
                "CF", "AT", "SD", "MS", "AC", "SA", "CA", "SN", "SU", "OF",
                "LF", "AVG", "SDI", "LS", "AE", "MAE", "ATS", "LN", "LU", "SLF", "HF",
                "ST", "BU", "PL", "ATA", "ATT", "SP", "N", "HU", "SNT", "FWD"
        };
        for (String valid : validPositions) {
            if (position.equalsIgnoreCase(valid)) {
                return true;
            }
        }
        return false;
    }



}