package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
abstract class EmployeeStatus extends Employee {

    EmployeeStatus(String name) {
        super(name);
    }

    abstract String job();

}
