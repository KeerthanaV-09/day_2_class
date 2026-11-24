class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

 class Main {
    public static void main(String[] args) {
        SalesEmployee emp = new SalesEmployee();
        emp.baseSalary = 30000.0;
        emp.bonus = 8500.0;

        System.out.println("Total Salary: " + emp.calculateSalary());
    }
}