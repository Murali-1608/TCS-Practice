import java.util.*;
public class Practice_010
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int sum=0, num=0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch>='0' && ch<='9')
            {
                num = num*10 + (ch-'0');
            }
            else
            {
                sum=sum+num;
                num=0;
            }
        }
        sum=sum+num;
        System.out.println("Output: "+sum);
    }
}
