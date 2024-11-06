/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 *
 * This is the class employee that inherits from person to add their hire date status and department.
 */
public class Employee extends Person {
    protected String hireDate;
    protected String status;
    protected String department;

    /**
     *Employee no arg con
     */
    public Employee() {
        this.setHireDate("");
        this.setStatus("");
        this.setDepartment("");
    }

    /**
     * toString for employee
     * @return
     */
    @Override
    public String toString(){
       return super.toString()+ "\n" +this.hireDate + "," + this.status + "," + this.department ;
    }



    /**
     * getters and setters
     * @return
     */
    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
