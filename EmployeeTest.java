/*
Name: Kennedy Keyes
Date: September 17, 2021
Program: EmployeeTest.java
Description: This program demonstrates class Employee's capabilities.
 */
package employeetest;

/**
 *
 * @author codingken
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create new employee objects for Emplyee 1 and Employee 2
        Employee employee1 = new Employee("Mike", "Philip", 6384.24);
        Employee employee2 = new Employee("Beth", "Andrews", 7293.38);
        
        // Display employee 1
        System.out.println("Yearly Salary: ");
        System.out.printf("%nFirst Name: %s%n", employee1.getFirstName());
        System.out.printf("Last Name: %s%n", employee1.getLastName());
        System.out.printf("Monthly Salary: %.2f%n", employee1.getMonthlySalary());
        System.out.printf("Yearly Salary: %.2f%n", employee1.getYearlySalary());     
        
        // Display employee 2
        System.out.printf("%nFirst Name: %s%n", employee2.getFirstName());
        System.out.printf("Last Name: %s%n", employee2.getLastName());
        System.out.printf("Monthly Salary: %.2f%n", employee2.getMonthlySalary());
        System.out.printf("Yearly Salary: %.2f%n", employee2.getYearlySalary());      
        
        // Change data for employee 1 and 2's 10% raise
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);
        
        // Display employees with new data (raise)
        System.out.printf(" %nUpdated Yearly Salary: %n");
        System.out.printf("%nFirst Name: %s%n", employee1.getFirstName());
        System.out.printf("Last Name: %s%n", employee1.getLastName());
        System.out.printf("Monthly Salary: %.2f%n", employee1.getMonthlySalary());
        System.out.printf("Yearly Salary: %.2f%n", employee1.getYearlySalary());     
        System.out.printf("%nFirst Name: %s%n", employee2.getFirstName());
        System.out.printf("Last Name: %s%n", employee2.getLastName());
        System.out.printf("Monthly Salary: %.2f%n", employee2.getMonthlySalary());
        System.out.printf("Yearly Salary: %.2f%n", employee2.getYearlySalary()); 
    }
    
}
