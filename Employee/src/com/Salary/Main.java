package com.Salary;

import com.Salary.ContractEmployee;
import com.Salary.Employee;

public class Main {
    public static void main(String [] args){
     Employee[] employee = new Employee[4];
     employee[0] = new SalariedEmployee("Kovalenko Yurii", "0432", "2341", 160, 80);
     employee[1] = new SalariedEmployee("Kuk Andriana", "0433", "2315", 100, 60);
     employee[2] = new ContractEmployee("Koval Nataliia", "0434", "4321", 12000);
     employee[3] = new ContractEmployee("Pavlenko Oleh", "0435", "4532", 11500);

     for(int i = 0; i < employee.length - 1 ; i++){
         if(employee[i].calculatePay() < employee[i + 1].calculatePay()){
             Employee temp = employee[i + 1];
             employee[i + 1] = employee[i];
             employee[i] = temp;
         }
     }
     for(int i = 0; i < employee.length; i++){
         System.out.println("\nID: " + employee[i].employeeId
                 + "\nName: " + employee[i].name
                 + "\nAvwrage salary: " + employee[i].calculatePay());
     }
    }
}
