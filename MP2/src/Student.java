/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 * This is the student class to create student objects that add major credit hours gpa and class schedule
 */
import java.util.ArrayList;
public class Student extends Person{
    protected String major;
    protected int creditHours;
    protected float gpa;
    protected ArrayList<String> classSchedule;

    /**
     * no arg student constructor
     */
    public Student(){
        this.setMajor("");
        this.setCreditHours(0);
        this.setGpa(0);
        this.setClassSchedule(new ArrayList<>());
    }

    /**
     *
     * @param major
     * @param creditHours
     * @param gpa
     * @param classSchedule
     */
    public Student(String major, int creditHours, float gpa, ArrayList<String> classSchedule){
        this.setMajor(major);
        this.setCreditHours(creditHours);
        this.setGpa(gpa);
        this.setClassSchedule(classSchedule);
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        StringBuilder finalString = new StringBuilder(super.toString() + "\n" + this.major + "," + this.creditHours + "," + this.gpa + "\n");
        int i;
        for(i=0; i< this.classSchedule.size(); i++){
            finalString.append(this.classSchedule.get(i) + ",");
        }
        // remove the comma at the end
        finalString.deleteCharAt(finalString.length()-1);
        return finalString.toString() ;

    }

    /**
     * getters and setters
     * @return
     */
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
// ArrayList mutators and accessors
    public ArrayList<String> getClassSchedule() {
        return classSchedule;
    }

    public void addClassSchedule(String classSchedule){
        this.classSchedule.add(classSchedule);
    }

    public int numClassSchedule(){
        return this.classSchedule.size();
    }

    public void setClassSchedule(ArrayList<String> classSchedule) {
        this.classSchedule = classSchedule;
    }

    public void deleteClassSchedule(String classSchedule){
        this.classSchedule.remove(classSchedule);
    }


}
