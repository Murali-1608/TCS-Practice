/*

Problem Statement
1. Create a class Employee with the following attributes:
employeeId (int)
name (String)
branch (String)
rating (double)
companyTransport (boolean)
The attributes should be private. Write a parameterised constructor and necessary getters (specifically for rating, branch, and companyTransport)
.
2. Create a class MyClass which contains the main method. Implement two static methods within MyClass:
findCountOfEmployeesUsingCompanyTransport: This method takes an array of Employee objects and a String (branch name) as parameters
. it returns the count of employees who belong to the given branch (case-insensitive) and use company transport (companyTransport is true)
. If the count is 0, it should return 0.
findEmployeeWithSecondHighestRating: This method takes an array of Employee objects as a parameter
. It should return the Employee object who has the second-highest rating among those who do not use company transport
. If there are fewer than two such employees or all employees use company transport, return null
.
3. Main Method Requirements:
Use a Scanner object to read data for 4 Employee objects
.
Read an additional String for the branch name
.
For the first method: If the returned count is greater than 0, print the count. Otherwise, print "No such Employee"
.
For the second method: If the returned object is not null, print the employeeId and name on separate lines
. If it is null, print "All Employees using company transport"
.
 */

package OOPS;

import java.util.*;

class Employee
{

    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    // Parameterized Constructor

    Employee(int employeeId, String name, String branch, double rating, boolean companyTransport)
    {
        this.employeeId = employeeId;
        this.name=name;
        this.branch = branch;
        this.rating=rating;
        this.companyTransport=companyTransport;
    }


    // Getter

    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getName()
    {
        return name;
    }

    public String getBranch()
    {
        return branch;
    }

    public double getRating()
    {
        return rating;
    }

    public boolean getCompanyTransport()
    {
        return companyTransport;
    }

    // Setter

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setBranch(String branch)
    {
        this.branch=branch;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public void setCompanyTransport(boolean companyTransport)
    {
        this.companyTransport = companyTransport;
    }
}
public class Ques_03
{

    public static int findCountOfEmployees(Employee[] empl, String branchname)
    {
        int count=0;

        for(Employee emp:empl)
        {
            if(emp.getBranch().equalsIgnoreCase(branchname) && emp.getCompanyTransport())
            {
                count++;
            }
        }
        return count;
    }

    public static Employee findEmployeeSecHigh(Employee[] empl)
    {
        Employee High = null;
        Employee secHigh = null;

        for(Employee emp:empl)
        {
            if(!emp.getCompanyTransport()) /* in question it is said who do not use so == if(emp.getCompanyTransport() == false) )*/
            {
                if(High == null || emp.getRating() > High.getRating())
                {
                    secHigh=High;
                    High=emp;
                }

                else if(secHigh == null || emp.getRating() > secHigh.getRating())
                {
                    secHigh = emp;
                }
            }
        }
        return secHigh;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee[] empl = new Employee[4];

        // Object Reading =  [ Concept array Declaration + Reading ]

        for(int i=0;i<empl.length;i++)
        {
            int employeeId = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();
            boolean companyTransport = sc.nextBoolean();sc.nextLine();

            empl[i] = new Employee(employeeId, name, branch, rating, companyTransport);
        }

        String branchname = sc.nextLine();

        findCountOfEmployees(empl, branchname);
        findEmployeeSecHigh(empl);

    }
}
