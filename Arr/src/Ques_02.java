import java.util.*;
public class Ques_02
{
    static int removeSortDupl(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] != arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    static int[] removeUnsortDupl(int[] arr)
    {
        Set<Integer> uniqSet = new LinkedHashSet<>();

        for(int num:arr)
        {
            uniqSet.add(num);
        }

        int[] result = new int[uniqSet.size()];
        int i=0;
        for(int num:uniqSet)
        {
            result[i++] = num;
        }
        return result;
    }

    static List<Integer> findUniq(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> arr1 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                arr1.add(entry.getKey());
            }
        }
        return arr1;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr =new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        /*
        int len=removeSortDupl(arr);
        int[] len=removeUnsortDupl(arr);

        System.out.print("New Array: ");
        for(int num:len)
        {
            System.out.print(num + " ");
        }
         */

        List<Integer> Unique = findUniq(arr);
        System.out.println("Unique Element: "+Unique);


    }
}
