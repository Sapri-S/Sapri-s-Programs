
/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 * This creates the graduate student object which introduces new objects on top of the inherited ones, thesis, concentration, Assistance type.
 */
public class GraduateStudent extends Student {
    protected String thesis;
    protected String concentration;
    protected String assistanceType;

    /**
     * no-arg con
     */
    public GraduateStudent() {
        this.setThesis("");
        this.setConcentration("");
        this.setAssistanceType("");
    }



    /**
     * ToString
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+ "\n" + this.getThesis() + "," + this.concentration +","+ this.getAssistanceType();
    }

    /**
     * gets thesis
     * @return
     */
    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public String getAssistanceType() {
        return assistanceType;
    }

    public void setAssistanceType(String assistanceType) {
        this.assistanceType = assistanceType;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }
}
