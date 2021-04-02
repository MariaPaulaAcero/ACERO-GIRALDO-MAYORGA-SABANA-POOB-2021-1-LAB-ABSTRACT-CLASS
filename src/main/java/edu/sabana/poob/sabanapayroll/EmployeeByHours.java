package edu.sabana.poob.sabanapayroll;

public class EmployeeByHours extends Employee{

    private static final double HOUR = 6500;
    private int hoursWorked;


    public EmployeeByHours(String name, String lastName, Department department, int hoursWorked) {
        super(name, lastName, department);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        double salary = EmployeeByHours.HOUR * hoursWorked;
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + " payment by hours.";
    }
}