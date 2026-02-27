package week9;


public class Payroll {
    public static void main(String[] args) {

        PermanentEmployee pe =
                new PermanentEmployee(1, "Amit", 30000, 8000, 5000);

        ContractEmployee ce =
                new ContractEmployee(2, "Ravi", 1200, 22);

        System.out.println("Permanent Employee:");
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());

        System.out.println();

        System.out.println("Contract Employee:");
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}
