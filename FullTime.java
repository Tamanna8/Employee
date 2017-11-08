package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class FullTime extends Employee {

    public FullTime(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println(getName() + " salary is $ 15.00 per hour");
    }
}
