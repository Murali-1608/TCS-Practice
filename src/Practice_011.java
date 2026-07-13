import java.util.*;
public class Practice_011
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int sp=0,c=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                sp++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("Result: "+ sp + ","+c);

        String[] arr = str.split("\\s+");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);

            if(i!=0)
            {
                System.out.print(" ");
            }
        }
    }
}
