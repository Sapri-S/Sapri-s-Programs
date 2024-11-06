import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sapri Sise
 * 10/23/2024
 * cop 167 section 2
 *
 * The Department class will model a department and include information such as name, location, a list of employees, list of students.
 * The class also includes methods for adding and removing this information, and for saving or loading it from a file.
 * The key components of the class in summary, are as follows:
 */
public class Department {
    private String name;
    private String location;
    private ArrayList<Employee> employees;
    private ArrayList<Student> students;

    public Department(){
        this.setName(null);
        this.setLocation(null);
        this.employees = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public Department(String name, String location) {
        this.setName(name);
        this.setLocation(location);
    }


    public void writeDepartment(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);

        try {
            // Writing department name and location with line breaks
            writer.write(this.getName() + "\n");
            writer.write(this.getLocation() + "\n");

            // Write employees
            for (Employee employee : this.getEmployees()) {
                if (employee instanceof Faculty) {
                    writer.write("F\n" + ((Faculty) employee).toString() + "\n");
                } else if (employee instanceof Staff) {
                    writer.write("S\n" + ((Staff) employee).toString() + "\n");
                }
            }

            // Write students
            for (Student student : this.getStudents()) {
                if (student instanceof GraduateStudent) {
                    writer.write("G\n" + ((GraduateStudent) student).toString() + "\n");
                } else {
                    writer.write("U\n" + student.toString() + "\n");
                }
            }
        } finally {
            // Close to ensure data is flushed and saved
            writer.close();
        }
    }
/*
    public void writeDepartment(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);

        writer.write(this.getName());
        writer.write(this.getLocation());

        for (int i = 0; i < this.getEmployees().size(); i++) {
            if (employees.get(i) instanceof Faculty ) {
                Faculty faculty = (Faculty) employees.get(i);
                writer.write("F\n" );
                writer.write(faculty.toString());
            }
            else if (employees.get(i) instanceof Staff ) {
                Staff staff = (Staff) employees.get(i);
                writer.write("S\n");
                writer.write(staff.toString() + "\n");
            }
        }
        for (int i = 0; i < this.getStudents().size(); i++) {
            if (students.get(i) instanceof GraduateStudent ) {
                GraduateStudent student = (GraduateStudent) students.get(i);
                writer.write("G\n");
                writer.write(student.toString() + "\n");
            }
            else if (students.get(i) instanceof Student ) {
                Student student = (Student) students.get(i);
                writer.write("U\n");
                writer.write(student.toString() + "\n");
            }
        }

    }

 */



    public void readDepartment(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
        Scanner scanner = new Scanner(reader);
        this.students = new ArrayList<>();
        this.employees = new ArrayList<>();

        this.setName(scanner.nextLine());
        this.setLocation(scanner.nextLine());

        while(scanner.hasNext()){
            String depRole = scanner.nextLine();
            //under grad
            if (depRole.equals("U")){
                Student student = new Student();

                String[] studentInfo= scanner.nextLine().split("[,]");
                student.setFirstname(studentInfo[0]);
                student.setLastname(studentInfo[1]);
                student.setStudentId(studentInfo[2]);
                student.setBirthDate(studentInfo[3]);
                student.setPhoneNumber(studentInfo[4]);

                String[] classInfo = scanner.nextLine().split("[,]");
                student.setMajor(classInfo[0]);
                String CH = classInfo[1].trim();
                student.setCreditHours(Integer.parseInt(CH));
                String gpa = classInfo[2].trim();
                student.setGpa(Float.parseFloat(gpa));

                String[] classes = scanner.nextLine().split("[,]");
                for (int i = 0; i < classes.length; i++){
                    student.addClassSchedule(classes[i]);
                }

                students.add(student);


            }
            else if (depRole.equals("G")){
                GraduateStudent student = new GraduateStudent();
                String[] studentInfo= scanner.nextLine().split("[,]");
                student.setFirstname(studentInfo[0]);
                student.setLastname(studentInfo[1]);
                student.setStudentId(studentInfo[2].trim());
                student.setBirthDate(studentInfo[3].trim());
                student.setPhoneNumber(studentInfo[4].trim());

                String[] classInfo = scanner.nextLine().split("[,]");
                student.setMajor(classInfo[0]);
                String CH = classInfo[1].trim();
                student.setCreditHours(Integer.parseInt(CH));
                String gpa = classInfo[2].trim();
                student.setGpa(Float.parseFloat(gpa));

                String[] classes = scanner.nextLine().split("[,]");
                for (int i = 0; i < classes.length; i++){
                    student.addClassSchedule(classes[i]);
                }

                String[] GradInfo = scanner.nextLine().split("[,]");
                student.setThesis(GradInfo[0]);

                student.setConcentration(GradInfo[1]);

                student.setAssistanceType(GradInfo[2]);


                students.add(student);



            }
            else if (depRole.equals("F")){
                Employee employee = new Faculty();
                String[] employeeInfo= scanner.nextLine().split("[,]");
                employee.setFirstname(employeeInfo[0]);
                employee.setLastname(employeeInfo[1]);
                employee.setStudentId(employeeInfo[2].trim());
                employee.setBirthDate(employeeInfo[3].trim());
                employee.setPhoneNumber(employeeInfo[4]);

                String[] empInfo = scanner.nextLine().split("[,]");
                employee.setHireDate(empInfo[0]);
                employee.setStatus(empInfo[1].trim());
                employee.setDepartment(empInfo[2]);
                String[] facultyInfo = scanner.nextLine().split("[,]");
                ((Faculty) employee).setRank(facultyInfo[0]);
                ((Faculty) employee).setResearchArea(facultyInfo[1]);

                String[] classes = scanner.nextLine().split("[,]");
                for (int i = 0; i < classes.length; i++){
                    ((Faculty) employee).addCurrentCourse(classes[i]);
                }


                employees.add(employee);


            }
            else if (depRole.equals("S")){
                Employee employee = new Staff();

                String[] employeeInfo= scanner.nextLine().split("[,]");
                employee.setFirstname(employeeInfo[0]);
                employee.setLastname(employeeInfo[1]);
                employee.setStudentId(employeeInfo[2].trim());
                employee.setBirthDate(employeeInfo[3].trim());
                employee.setPhoneNumber(employeeInfo[4]);

                String[] empInfo = scanner.nextLine().split("[,]");
                employee.setHireDate(empInfo[0]);
                employee.setStatus(empInfo[1].trim());
                employee.setDepartment(empInfo[2]);
                String[] staffInfo = scanner.nextLine().split("[,]");
                ((Staff) employee).setJobTitle(staffInfo[0]);
                ((Staff) employee).setSupervisor(staffInfo[2]);
                ((Staff) employee).setCareerBand(staffInfo[1]);



                employees.add(employee);


            }
        }



    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addStudents(Student students) {
        this.students.add(students);
    }

    public void addEmployees(Employee employees) {
        this.employees.add(employees);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee, int index) {
        this.employees.set(index, employee);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student, int index) {
        this.students.set(index, student);
    }

    public int numStudents() {
        return students.size();
    }

    public int numEmployees() {
        return employees.size();
    }

    public void deleteEmployee(int index) {
        employees.remove(index);
    }

    public void deleteStudent(int index) {
        students.remove(index);
    }
}
