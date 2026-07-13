package OOPS;
import java.util.*;

class Employees
{
    private int id;
    private String name;
    private String dept;
    private double salary;
    private boolean permanent;

    Employees(int id, String name, String dept, double Salary, boolean permanent)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        this.permanent=permanent;
    }
    // Getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return dept;
    }

    public double getSalary()
    {
        return salary;
    }

    public boolean getPermanent()
    {
        return permanent;
    }

    // Setters
    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDepartment(String department)
    {
        this.dept = department;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setPermanent(boolean permanent)
    {
        this.permanent = permanent;
    }
}
public class Ques_10
{
    public static int CountEmploy(Employees[]employ, String dept)
    {
        int count=0;
        for(Employees emp:employ)
        {
            if(emp.getDepartment().equalsIgnoreCase(dept) && emp.getPermanent())
            {
                count++;
            }
        }
        return count++;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employees[] employ = new Employees[4];

        for(int i=0;i<employ.length;i++)
        {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String department = sc.nextLine();

            double salary = sc.nextDouble();
            sc.nextLine();

            boolean permanent = sc.nextBoolean();
            sc.nextLine();

            employ[i] = new Employees(id, name,
                    department,
                    salary,
                    permanent);

        }

        String dept = sc.nextLine();

        int result = CountEmploy(employ, dept);

        if(result>0)
        {
            System.out.print(result);
        }
        else
        {
            System.out.println("No Employee");
        }
    }
}
