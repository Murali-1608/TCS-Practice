/*
We have to getting the count of lowercase anad Uppercase from the string
String: DataBase
Output: 5
*/

import java.util.*;
public class Practice_002
{
    public static void main(String[] main)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        int Lowercount=0;
        int Uppercount=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                Lowercount++;
            }
            if(ch>='A' && ch<='Z')
            {
                Uppercount++;
            }
        }
        System.out.println("Result: ");
        System.out.println(Lowercount);
        System.out.println(Uppercount);
    }
}
