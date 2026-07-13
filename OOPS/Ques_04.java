/*
Problem Statement
1. Create a class AutonomousCar with the following attributes:
carId (int)
brand (String)
noOfTestsConducted (int)
noOfTestsPassed (int)
environment (String)
grade (String)

The attributes should be private.
Write a parameterised constructor (excluding grade) and necessary getters.

2. Create a class Solution containing the main method and two static methods:

findTestPassedByEnv:

This method takes an array of AutonomousCar objects and a String (environment) as parameters.
It calculates the sum of noOfTestsPassed for all cars where the environment matches the input (case-insensitive).
It returns the sum if any matches are found; otherwise, it returns 0.

updateCarGrade:

This method takes an array of AutonomousCar objects and a String (brand) as parameters.
It finds the car object matching the given brand (case-insensitive).
Before returning the object, it calculates a rating: (noOfTestsPassed * 100) / noOfTestsConducted.

-- If the rating is greater than 80, the grade is set to "A1".
-- Otherwise, the grade is set to "B2".
-- If the brand does not match, return null.

3. Main Method Requirements: Read data for 4 AutonomousCar objects.
Read an additional String for the environment and another String for the brand.
For the first method: If the return value is greater than 0, print the value. Otherwise, print "There are no test cases passed in the particular environment".
For the second method: If the returned object is not null, print the brand and grade in the format: brand::grade. If it is null, print "No car is available with the specified brand".

*/
package OOPS;

import java.util.*;

class AutonomousCar
{
    private int carId;
    private String brand;
    private int noOfTestConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    // Parameterised Constructor

    AutonomousCar(int carId, String brand, int noOfTestConducted, int noOfTestsPassed, String environment)
    {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestConducted = noOfTestConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    // Getter

    public int getCarId()
    {
        return carId;
    }


    public String getbrand()
    {
        return brand;
    }

    public int getNoOfTestsConducted()
    {
        return noOfTestConducted;
    }

    public int getNoOfTestsPassed()
    {
        return noOfTestsPassed;
    }

    public String getEnvironment()
    {
        return environment;
    }

    public String getGrade()
    {
        return grade;
    }

    // Setter

    public void setGrade(String grade)
    {
        this.grade=grade;
    }

}

public class Ques_04
{
    public static int findTestPassed(AutonomousCar[] cars, String searchEnv)
    {
        int sum=0;

        for(AutonomousCar car:cars)
        {
            if(car.getEnvironment().equalsIgnoreCase(searchEnv))
            {
                sum += car.getNoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String searchBrand)
    {
        for(AutonomousCar car:cars)
        {
            if(car.getbrand().equalsIgnoreCase(searchBrand))
            {
                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();

                if(rating>80)
                {
                    car.setGrade("A1");
                }
                else
                {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[]  cars = new AutonomousCar[4];

        for(int i=0;i<cars.length;i++)
        {
            int carId = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();sc.nextLine();
            int noOfTestsPassed = sc.nextInt();sc.nextLine();
            String environment = sc.nextLine();

            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        String searchEnv=sc.nextLine();
        String searchBrand = sc.nextLine();

        // Method 1
        int total = findTestPassed(cars, searchEnv);
        if(total>0)
        {
            System.out.println("Total Passed");
        }

        else
        {
            System.out.println("NULL");
        }

        //Method 2

        AutonomousCar car = updateCarGrade(cars,searchBrand);
        if(car!=null)
        {
            System.out.println(car.getbrand() + "::" + car.getGrade());
        }

        else
        {
            System.out.println("No car is available with the specified brand");
        }
    }
}
