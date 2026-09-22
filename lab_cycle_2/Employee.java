class Employee{
    void calculateSalary(){
        System.out.println();
    }
    public static void main(String[]args){
        Employee e;

        e = new Manager();
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();

        e = new Intern();
        e.calculateSalary();
    }
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary: 24000");
    }
}

class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Developer salary: 20000");
    }
}

class Intern extends Employee{
    void calculateSalary(){
        System.out.println("Intern salary: 16000");
    }
}