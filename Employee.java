/*
Name: Kennedy Keyes
Date: September 17, 2021
Program: Employee.class
Description: This class includes a constructor that initiates 
three instance variables for the Employees' salary. 
 */
package employeetest;

/**
 *
 * @author codingken
 */
public class Employee 
{
    // Declare instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    // Create the constructor
    public Employee(String firstName, String lastName, 
            double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Determine if the monthly salary is positive
        if(monthlySalary > 0.0)
        {
            this.monthlySalary = monthlySalary;
        } 
    } // end constructor
    
    // Set first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    // Get first name
    public String getFirstName()
    {
        return firstName;
    }
    
    // Set last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    // Get last name
    public String getLastName()
    {
        return lastName;
    }
    
    // Set monthly salary
    public void setMonthlySalary(double monthlySalary)
    {
        // Determine if it's 0 or positive
        if (monthlySalary >= 0.0)
        {
            this.monthlySalary = monthlySalary;
        }
    }
    
    // Get monthly salary
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    
    // Calculate and return annual salary
    public double getYearlySalary()    
    {   
        return getMonthlySalary() * 12;
    }
}
