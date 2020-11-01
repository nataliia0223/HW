package com.Salary;
import com.Salary.Employee;
import com.Salary.Payment;

public class SalariedEmployee extends Employee implements Payment {
    public String socialSecurityNumber;
    public double hourlyRate;
    public double numberOfHoursWorked;

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked){
        this.name = name;
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double calculatePay(){
        return hourlyRate * numberOfHoursWorked;
    }
}
