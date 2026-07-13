import java.util.*;
public class Practice_004
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        String str = sc.nextLine();
        int s_count=0, c_count=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch==' ')
            {
                s_count++;
            }
            else if(ch>='a' || ch<='z' || ch>='A' || ch<='Z') {
                c_count++;
            }
        }
        System.out.println(s_count+" "+c_count);
    }
}
