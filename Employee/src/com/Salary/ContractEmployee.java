package com.Salary;
import com.Salary.*;

public class ContractEmployee extends Employee implements Payment {
    public String federalTaxIdmember;
    public double fixedMonthyPayment;

    public ContractEmployee(String name, String employeeId, String  federalTaxIdmember, double fixedMonthyPayment){
        this.name = name;
        this.employeeId = employeeId;
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthyPayment = fixedMonthyPayment;
    }

    public double calculatePay(){
        return fixedMonthyPayment;
    }
}
