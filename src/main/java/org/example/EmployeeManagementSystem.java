package org.example;

//Q2: Employee Management System
//Create an abstract class Employee with:
//Fields: name, id, salary
//Abstract method: calculateBonus()
//Create two subclasses:
//Manager → bonus is 20% of salary.
//Developer → bonus is 10% of salary.
//Demonstrate abstraction and inheritance.

abstract class Employee{
    public String name;
    public int id;
    final double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void calculateBonus();

}
class Manager extends Employee
{
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }
    void empDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: "+ id);
    }


    @Override
    void calculateBonus() {
        double bonus=0.05;
        System.out.println("Bonus: " + bonus*salary);
    }
}
class Developer extends Employee
{
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }
    void empDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: "+ id);
    }

    @Override
    void calculateBonus() {
        double bonus=0.05;
        System.out.println("Bonus: " + bonus*salary);
    }
}

public class Emp {

    public static void main(String[] args) {
        Manager mn1 = new Manager("Gursidak Singh" , 10268, 15000);
        mn1.empDetails();
        mn1.calculateBonus();
        System.out.println();
        Developer dv1 = new Developer("Rishu Raj" , 10266, 15000);
        dv1.empDetails();
        dv1.calculateBonus();


    }
}
