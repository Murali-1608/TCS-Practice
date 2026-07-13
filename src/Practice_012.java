import java.util.*;
public class Practice_012
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count=0;
        char ch = str.charAt(0);

        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
            else
            {
                System.out.print(ch+""+count);
                ch=str.charAt(i);
                count=1;
            }
        }
        System.out.print(ch+""+count);
    }
}
