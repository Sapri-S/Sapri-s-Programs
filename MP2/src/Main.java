import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 *
 *Main method to take and retain
*/
public class Main {
    public static void main(String[] args) throws IOException {

        Person sapri = new Student();
        ((Student) sapri).setMajor("comp");
        ((Student) sapri).setCreditHours(99);
        ((Student) sapri).setGpa(3.5F);
        GraduateStudent Haddy = new GraduateStudent();
        Haddy.setThesis("Is breakfast a time or a placement of a meal");
        Haddy.setConcentration("Brain Science");
        Haddy.setAssistanceType("TA");
        Haddy.setFirstname("Haddy");
        Haddy.setMajor("neuroscience");
        Haddy.setLastname("Sowe");
        Haddy.setGpa(4.0f);
        Haddy.setBirthDate("10/13/2004");
        Haddy.setCreditHours(120);
        Haddy.addClassSchedule("BIO 300");
        Haddy.addClassSchedule("CHM 340");
        Employee Bryant = new Faculty();
        Bryant.setFirstname("Kelvin");
        Bryant.setLastname("Bryant");
        Bryant.setHireDate("1/21/2001");
        Bryant.setStatus("FT");
        Bryant.setDepartment("Computer Science");
        ((Faculty) Bryant).setRank("Full");
        ((Faculty) Bryant).setResearchArea("Software Engineering");

        if (args.length > 0) {
            String fileName = args[0];
            Department department = new Department();
            department.readDepartment(fileName);
            department.addStudents(Haddy);
            department.addEmployees(Bryant);
            department.writeDepartment("NewJoint");


        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a file name");
            String DepName = scanner.nextLine();
            Department department = new Department();
            department.readDepartment(DepName);
        }

/*


        // department.readDepartment("C:\\Users\\sap\\Downloads\\MP2\\src\\Sample.txt");
        // department.writeDepartment("C:\\Users\\sap\\Downloads\\MP2\\src\\Sample.txt");



        System.out.println("\n"+Haddy.toString());
        System.out.println("\n" + sapri.toString()+"\n");
        JOptionPane.showMessageDialog(null,Haddy.toString(),"Graduate Student", JOptionPane.INFORMATION_MESSAGE);


        JOptionPane.showMessageDialog(null,sapri.toString(),"Student", JOptionPane.INFORMATION_MESSAGE);


        Employee Bryant = new Faculty();
        Bryant.setFirstname("Kelvin");
        Bryant.setLastname("Bryant");
        Bryant.setHireDate("1/21/2001");
        Bryant.setStatus("FT");
        Bryant.setDepartment("Computer Science");
        ((Faculty) Bryant).setRank("Full");
        ((Faculty) Bryant).setResearchArea("Software Engineering");
        System.out.println(((Faculty) Bryant).toString());
        JOptionPane.showMessageDialog(null,((Faculty) Bryant).toString(),"Faculty", JOptionPane.INFORMATION_MESSAGE);

        Employee Lefore = new Staff();
        Lefore.setFirstname("Derrick");
        Lefore.setLastname("Lefore");
        Lefore.setHireDate("1/1/2000");
        Lefore.setStatus("FT");
        Lefore.setDepartment("Computer Science");
        ((Staff) Lefore).setJobTitle("Building Manager");
        ((Staff) Lefore).setSupervisor("Effort");
        ((Staff) Lefore).setCareerBand("Advanced");
        System.out.println("\n"+((Staff) Lefore).toString());

        JOptionPane.showMessageDialog(null, ((Staff) Lefore).toString(),"Staff", JOptionPane.INFORMATION_MESSAGE);




 */










    }
}