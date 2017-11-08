package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] list = new Employee[2];
        list[0] = new PartTime("Jonny");
        list[1] = new FullTime("Bravo");
        for (Employee a : list) {
            a.info();
        }
    }

}
