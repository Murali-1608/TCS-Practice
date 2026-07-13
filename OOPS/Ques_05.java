/*
Create a class Student with the following attributes:

id (int)
name (String)
totalMarksObtained (int)

The attributes should be private. Write a parameterised constructor and getters and setters for these attributes.
Note that the totalMarksObtained is the sum of marks from four subjects (maximum 100 marks per subject).


2. Create a class Solution which contains the main method. Implement two static methods in the Solution class:

findStudentWithHighestTotal: This method takes an array of Student objects as a parameter.
It identifies the student who has scored the highest total marks and returns that student's name in upper case.


searchStudentByPercentage: This method takes an array of Student objects as a parameter.
It calculates the percentage for each student (Total Marks / 4) and identifies students who scored 70% or more.
It should return a sorted list (ascending order) of the IDs of these students.
If no such student is found, it returns null.

3. Main Method Requirements:

Read an integer n representing the number of student objects to be added.
Read the data for n student objects.
For the first method: Call findStudentWithHighestTotal and print the returned name.

For the second method: Call searchStudentByPercentage. If the result is not null, print the student IDs one by one.
If the result is null, print "No student found with the mentioned attribute".

*/

package OOPS;
import java.util.*;

class Student
{
    private int id;
    private String name;
    private int totalMarksObtained;

    Student(int id, String name, int totalMarksObtained)
    {
        this.id = id;
        this.name = name;
        this.totalMarksObtained = totalMarksObtained;
    }

    // Getter

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getTotalMarksObtained()
    {
        return totalMarksObtained;
    }

    // Setter

    public void setId(int id)
    {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setTotalMarksObtained(int totalMarksObtained)
    {
        this.totalMarksObtained = totalMarksObtained;
    }
}

public class Ques_05
{

    public static String findHighTotal(Student[] stud)
    {
        Student high = stud[0];

        for(int i=1;i<stud.length;i++)
        {
            if(stud[i].getTotalMarksObtained() > high.getTotalMarksObtained())
            {
                high=stud[i];
            }
        }
        return high.getName().toUpperCase();
    }

    public static int[] searchStud(Student[] stud)
    {
        int[] result = new int[stud.length];
        int count=0;

        for(Student s:stud)
        {
            double percentage = s.getTotalMarksObtained()/4.0;

            if(percentage>=70)
            {
                result[count] = s.getId();
                count++;
            }
        }
        if(count==0)
        {
            return null;
        }
        // Bubble sort

        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                int temp = result[j];
                result[j]=result[j+1];
                result[j+1]=temp;
            }
        }

        // Create Exact Size Array
        int[] ans = new int[count];
        for(int i=0;i<count;i++)
        {
            ans[i]=result[i];
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stud = new Student[n];

        for(int i=0;i<stud.length;i++)
        {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int totalMarks = sc.nextInt(); sc.nextLine();

            stud[i]=new Student(id,name,totalMarks);
        }

        String high = findHighTotal(stud);
        System.out.println(high);

        int[] result = searchStud(stud);

        if(result == null)
        {
            System.out.print("NO STUDENT FOUND");
        }

        else
        {
            for(int id:result)
            {
                System.out.print(id);
            }
        }


    }

}
