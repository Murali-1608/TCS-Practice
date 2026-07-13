import java.util.*;
public class Practice_005
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] temp = str.split("\\s+ ");

        for(int i=0;i<temp.length;i++)
        {
            String word = temp[i];
            char ch=word.charAt(0);

            if(ch=='a'||ch=='A'|| ch=='e'||ch=='E' || ch=='i'||ch=='I' || ch=='o'||ch=='O' || ch=='u'||ch=='U')
            {
                System.out.print(ch);
            }
        }
    }
}
