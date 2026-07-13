import java.util.*;
public class Practice_008
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int digit = sc.nextInt();

        int evensum=0;
        int oddsum=0;
        int evenprod=1;
        int oddprod=1;
        for(int temp=digit;temp!=0;temp/=10)
        {
            int num = temp%10;
            if(num%2==0)
            {
                evensum += num;
                evenprod *=num;
            }
            else
            {
                oddsum += num;
                oddprod *= num;
            }
        }
        System.out.println("Even Sum: "+evensum);
        System.out.println("Even Prod: "+evenprod);
        System.out.println("Odd Sum: "+oddsum);
        System.out.println("Odd Prod: "+oddprod);
    }
}
