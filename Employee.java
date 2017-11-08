package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;

    }

    abstract void info();

    public String getName() {
        return name;
    }

}
