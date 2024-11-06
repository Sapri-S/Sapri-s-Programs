/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 * this is the super class for all the objects that were making other than department, including firstname last name studentid birthdate and phone number.
 */
public class Person {
    protected String firstname;
    protected String lastname;
    protected String studentId;
    protected String birthDate;
    protected String phoneNumber;

    /**
     * Person No arg
     */
    public Person(){
        this.firstname = "Sapri";
        this.lastname = "Sise";
        this.studentId = "9505250";
        this.birthDate = "06/27/2005";
        this.phoneNumber = "555-444-3333";
    }

    /**
     * person with arg
     * @param firstname
     * @param lastname
     * @param studentId
     * @param birthDate
     * @param phoneNumber
     */
    public Person(String firstname, String lastname, String studentId, String birthDate, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    /**
     * ToString overide
     * @return
     */
    @Override
    public String toString() {
        return this.firstname + "," + this.lastname + "," + this.studentId + "," + this.birthDate + "," + this.phoneNumber;
    }


    // Getters and setters


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
