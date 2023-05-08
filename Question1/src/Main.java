import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want to register?");
        int amountEmp = sc.nextInt();
        sc.nextLine();
        Employee[] dataEmp = new Employee[amountEmp];

        for(int i = 0; i < amountEmp; i++){
            System.out.println("Name of employee:");
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();
            if(salary < 0){
                throw new RuntimeException("The salary cannot be negative");
            }
            dataEmp[i] = new Employee(name, salary);
            System.out.println();
        }
        for(Employee employee: dataEmp){
            System.out.println(employee.toString());
            if(employee.getSalary() <= 1000){
                double bonus = employee.getSalary() * 0.20;
                double liquidSalary = employee.getSalary() + bonus;
                System.out.println("Bonus: " + bonus);
                System.out.println("Liquid salary: " + liquidSalary);
            } else if (employee.getSalary() > 2000) {
                double discount = employee.getSalary() * 0.10;
                double liquidSalary = employee.getSalary() - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Liquid salary: " + liquidSalary);
            }
            else{
                double bonus = employee.getSalary() * 0.10;
                double liquidSalary = employee.getSalary() + bonus;
                System.out.println("Bonus: " + bonus);
                System.out.println("Liquid salary: " + liquidSalary);
            }
            System.out.println();
        }
    }
}