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
            System.out.println("Employee: " + a.getName());
            a.info();
            if (a instanceof PartTime) {
                System.out.println("Job Title: "
                        + ((PartTime) a).job());
            }

        }

    }

}
