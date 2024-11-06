/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 *
 * This is thr staff class that inherits from employee and adds the properties job title supervisor and careerBand;
 */
public class Staff extends Employee {
    protected String jobTitle;
    protected String supervisor;
    protected String careerBand;

    /**
     * no arg
     */
    public Staff() {
        this.jobTitle = "";
        this.supervisor = "";
        this.careerBand = "";
    }

    /**
     * constructor
     * @param jobTitle
     * @param supervisor
     * @param careerBand
     */
    public Staff(String jobTitle, String supervisor, String careerBand) {
        this.jobTitle = jobTitle;
        this.supervisor = supervisor;
        this.careerBand = careerBand;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + "\n" + this.jobTitle + "," + this.careerBand + "," + this.supervisor;
    }

    /**
     * getters and setters
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getCareerBand() {
        return careerBand;
    }

    public void setCareerBand(String careerBand) {
        this.careerBand = careerBand;
    }
}
