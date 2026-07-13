/* Practice 1
String Input: Xplore
Character Input: r
Output: 4
 */

import java.util.*;
public class Practice_001
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
