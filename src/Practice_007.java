import java.util.*;
public class Practice_007
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = sc.nextInt();
        int sum = 0,x;

        while(num!=0)
        {
            x=num%10;
            sum=sum+x;
            num=num/10;
        }

        if(sum%3==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
