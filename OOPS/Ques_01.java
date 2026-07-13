/*
Problem Statement

1. Create a class Course with the following attributes:

courseId (int)
courseName (String)
courseAdmin (String)
quiz (int)
handsOn (int)

The attributes should be private. Write getters, setters, and a parameterised constructor.

2.
Create a class CourseProgram which contains the main method.
In the CourseProgram class, implement two static methods:

findAvgOfQuizByAdmin: This method will take an array of Course objects and a String value (course admin) as parameters.
 It will calculate the average of the quiz questions for the given course admin (case-insensitive).
 If a match is found, return the average; otherwise, return 0.

sortCourseByHandsOn: This method will take an array of Course objects and an int value (hands-on) as parameters.
 It should return an array of Course objects in ascending order of their handsOn values, but only for those courses where the handsOn value is less than the given input parameter.
 If no such courses exist, return null.

3. Main Method Requirements:

Take input for 4 Course objects using the Scanner class.
Take an additional String input for courseAdmin and an int input for handsOn.
For the first method: If the return value is greater than zero, print the average. Otherwise, print "No course found".
For the second method: If the return value is not null, print the courseName for each object in the returned array. Otherwise, print "No course found with mentioned attributes".
 */


package OOPS;
import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handsOn;


    // Constructor

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }

    // Getter Method

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandsOn() {
        return handsOn;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }


    // Setter

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setHandsOn(int handsOn) {
        this.handsOn = handsOn;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }
}

public class Ques_01
{
    static int findAvg(Course[] s1, String x)
    {
        int sum=0;
        int count=0;
        for(int i=0;i<s1.length;i++) {
            if (s1[i].getCourseAdmin().equalsIgnoreCase(x)) {
                sum += s1[i].getQuiz();
                count++;
            }
        }

        if(count==0)
        {
            return 0;
        }
        else
        {
            int avg = sum/count;
            return avg;
        }
    }

    // Sort - Mostly use Bubble Sort

    static Course[] sortCourse(Course[] s1, int h)
    {
        Course[] res = new Course[4];
        int count=0;

        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].getHandsOn()<h)
            {
                res[count] = s1[i];
                count++;
            }
        }

        // Bubble Sort
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(res[j].getHandsOn()>res[j+1].getHandsOn())
                {
                    Course temp = res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                }
            }
        }

        Course[] result = new Course[count];

        for(int i=0;i<count;i++)
        {
            result[i]=res[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Object Creation
        Course[] s1 = new Course[4];

        // Object Declaration
        for(int i=0;i<4;i++)
        {
            int a = sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e=sc.nextInt();sc.nextLine();

            s1[i]= new Course(a,b,c,d,e);
        }

        String courseAdmin = sc.nextLine();
        int handson = sc.nextInt();

        int avg = findAvg(s1, courseAdmin);
        if(avg != 0)
        {
            System.out.println(avg);
        }
        else {
            System.out.println("No Course");
        }
    }
}
