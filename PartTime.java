package sharmat;

/**
 *
 * @author Tamanna Sharna
 */
public class PartTime extends EmployeeStatus {

    public PartTime(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println(getName() + " salary is $ 11.00 per hour");
    }

    @Override
    String job() {
        return "Assistant";
    }

}
