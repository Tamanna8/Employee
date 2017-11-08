package sharmat;

/**
 *
 * @author Tamanna Sharna
 */
public class PartTime extends Employee {

    public PartTime(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println(getName() + " salary is $ 11.00 per hour");
    }
}
