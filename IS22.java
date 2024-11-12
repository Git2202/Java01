class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, String employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class IS22{
    public static void main(String[] args) {
        new Manager("Alice", 40, "M123", "HR").display();
    }
}
