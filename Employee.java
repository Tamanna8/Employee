package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;

    }

    public void info() {
        System.out.println("The salary of " + name + " is $5.00");
    }

    public String getName() {
        return name;
    }

}
