import java.util.*;
public class Practice_009
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Line" );

        String str = sc.nextLine();
        int LowCount=0, UpCount=0, VowCount=0, ConstCount=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                UpCount++;
            }
            else if(Character.isLowerCase(ch))
            {
                LowCount++;
            }
            if(Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);

                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                {
                    VowCount++;
                }
                else
                {
                    ConstCount++;
                }
            }
        }
        System.out.println("Lowercase Count: " + LowCount);
        System.out.println("Uppercase Count: " + UpCount);
        System.out.println("Vowel Count: " + VowCount);
        System.out.println("Consonant Count: " + ConstCount);
    }
}
