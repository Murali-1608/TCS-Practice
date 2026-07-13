import java.util.*;
public class Practice_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum=0;

        for(int i=0;i<str.length();i++)
        {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),3);
        }
        if(sum == Integer.parseInt(str))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
