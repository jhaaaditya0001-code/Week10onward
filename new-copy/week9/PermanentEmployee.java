package week9;

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String name, double basicSalary, double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }
}
