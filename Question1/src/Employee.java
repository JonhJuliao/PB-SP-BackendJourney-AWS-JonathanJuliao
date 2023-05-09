public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Function name: toString
     *
     * Inside the function:
     * 1. @return the name and the salary of an employee (String)
     */
    @Override
    public String toString() {
        return
                "Name:" + name +
                        "\nSalary: R$" + salary;
    }
}
