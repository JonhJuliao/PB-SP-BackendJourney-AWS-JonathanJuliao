import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createEmployees();
    }

    /**
     * Function name: createEmployees
     *
     * Inside the function:
     * 1. Create an array of employees
     * 2. Print their names, salaries, bonus or discounts and liquid salaries
     */
    public static void createEmployees() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want to register?");
        int amountEmp = sc.nextInt();
        sc.nextLine();
        if(amountEmp < 0) {
            throw new NumberFormatException("Invalid number format!");
        }
        Employee[] dataEmp = new Employee[amountEmp];

        for(int i = 0; i < amountEmp; i++){
            System.out.println("Name of employee:");
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();
            if(salary < 0){
                throw new NumberFormatException("The salary cannot be negative");
            }
            dataEmp[i] = new Employee(name, salary);
            System.out.println();
        }
        for(Employee employee: dataEmp){
            System.out.println(employee.toString());
            if(employee.getSalary() <= 1000){
                double bonus = employee.getSalary() * 0.20;
                double liquidSalary = employee.getSalary() + bonus;
                System.out.println("Bonus: R$" + bonus);
                System.out.println("Liquid salary: R$" + liquidSalary);
            } else if (employee.getSalary() > 2000) {
                double discount = employee.getSalary() * 0.10;
                double liquidSalary = employee.getSalary() - discount;
                System.out.println("Discount: R$" + discount);
                System.out.println("Liquid salary: R$" + liquidSalary);
            }
            else{
                double bonus = employee.getSalary() * 0.10;
                double liquidSalary = employee.getSalary() + bonus;
                System.out.println("Bonus: R$" + bonus);
                System.out.println("Liquid salary: R$" + liquidSalary);
            }
            System.out.println();
        }
    }


}
