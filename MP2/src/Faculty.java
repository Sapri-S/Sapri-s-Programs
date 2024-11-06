/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 *
 * This is the class faculty that inherits from employee to add theirRank research area and current courses.
 */
import java.util.ArrayList;

public class Faculty extends Employee {
    protected String rank;
    protected String researchArea;
    protected ArrayList<String> currentCourses;

    /**
     * no sarg construtor
     */

    public Faculty() {
        this.setRank("");
        this.setResearchArea("");
        this.setCurrentCourses(new ArrayList<>());
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        StringBuilder finalString = new StringBuilder(super.toString() + "\n" + this.rank + "," + this.researchArea +"\n");
        int i;
        for(i=0; i< this.currentCourses.size(); i++){
            finalString.append(this.currentCourses.get(i) + ",");
        }
        // remove the comma at the end
        finalString.deleteCharAt(finalString.length()-1);
        return finalString.toString();
    }



    /**
     * getters and setters
     * @return
     */
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
// ArrayList mutators and accessors
    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }

    public void addCurrentCourse(String course) {
        currentCourses.add(course);
    }

    public void removeCurrentCourse(String course) {
        currentCourses.remove(course);
    }
    public int numCurrentCourses() {
        return currentCourses.size();
    }
}
