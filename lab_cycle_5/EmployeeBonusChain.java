class Employee {
    double salary;
    final String companyName;

    Employee(double salary, String companyName) {
        this.salary = salary;
        this.companyName = companyName;
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

class Manager extends Employee {

    Manager(double salary, String companyName) {
        super(salary, companyName);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

class SeniorManager extends Manager {

    SeniorManager(double salary, String companyName) {
        super(salary, companyName);
    }

    @Override
    double calculateBonus() {
        double retentionBonus = 5000;
        return salary * 0.15 + retentionBonus;
    }
}

public class EmployeeBonusChain {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager(50000, "ABC Technologies");

        System.out.println("Company: " + sm.companyName);
        System.out.println("Salary: " + sm.salary);
        System.out.println("Bonus: " + sm.calculateBonus());
    }
}