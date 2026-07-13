/*
Find Character of a string at odd index
input: Management
Output: aaeet
 */
import java.util.*;
public class Practice_006
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            if(i%2==1)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
