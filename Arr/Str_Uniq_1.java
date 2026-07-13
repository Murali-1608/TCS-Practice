import java.util.*;
public class Str_Uniq_1
{
    // Count of integer between the strings
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 0;
        int n= str.length();

        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                int start = i;
                while(i<n && Character.isDigit(str.charAt(i)))
                {
                    i++;
                }

                int end = i-1;

                if(start>0 && end<n-1 && Character.isLetter(str.charAt(start-1)) && Character.isLetter(str.charAt(end+1)))
                {
                    count++;
                }

                else
                {
                    i++;
                }
            }
        }
        System.out.println("Count: "+count);
    }
}
