import java.util.*;
public class Int_Uniq_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int test=sc.nextInt();
        getDist(test);
    }

    static void getDist(int a)
    {
        int dist = 10;
        int x=0;
        int y=0;

        char ch = 'R';
        while(a>0)
        {
            switch(ch)
            {
                case 'R':
                    x=x+dist;
                    ch='U';
                    dist=dist+10;
                    break;

                case 'U':
                    y=y+dist;
                    ch='L';
                    dist=dist+10;
                    break;

                case 'L':
                    x=x-dist;
                    dist=dist+10;
                    ch='D';
                    break;

                case 'D':
                    y=y-dist;
                    dist=dist+10;
                    ch='A';
                    break;

                case 'A':
                    x=x-dist;
                    dist=dist+10;
                    ch='R';
                    break;
            }
            a--;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
