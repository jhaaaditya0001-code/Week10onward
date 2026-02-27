package week9;

class ContractEmployee extends Employee {
    int workingDays;

    ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    double calculateTotalSalary() {
        return basicSalary * workingDays;
    }
}
