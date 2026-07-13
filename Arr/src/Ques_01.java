import java.util.*;
public class Ques_01
{
    static int SmallEle(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    static int MaxEle(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    static int SecMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num>max)
            {
                secMax=max;
                max=num;
            }
            else if(num>secMax && num!=max)
            {
                secMax=num;
            }
        }
        return secMax;
    }

    static int secMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int num:arr)
        {
            if(num<min)
            {
                secMin=min;
                min=num;
            }
            else if(num<secMin && num!=min)
            {
                secMin=num;
            }
        }
        return secMin;
    }

    static int[] reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;
    }

    // Count Freq of Elementsgh
    static Map<Integer, Integer>countFreq(int[] arr)
    {
        Map<Integer,Integer> freqmap = new HashMap<>();
        for(int num:arr)
        {
            if(freqmap.containsKey(num))
            {
                int value = freqmap.get(num);
                freqmap.put(num,value+1);
            }
            else
            {
                freqmap.put(num,1);
            }
        }
        return freqmap;
    }

    static int[] Sorting(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int maxIndex = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[maxIndex])
                {
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        return arr;
    }

    static int sumOfarray(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    static int avgOfarray(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return (sum/2);
    }

    static int median(int[] ans)
    {
        int n = ans.length;
        if(n%2 == 0)
        {
            return (ans[n/2 - 1] + ans[n/2])/2;
        }
        else
        {
            return (ans[n/2]);
        }
    }

    static int Searching(int[] ans,int x)
    {
        int n = ans.length;
        int res=0;
        for(int i=0;i<ans.length;i++)
        {
            if(x==ans[i]) {
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /*
        System.out.println("Min Elements: "+SmallEle(arr));
        System.out.println("Max Elements: "+MaxEle(arr));
        System.out.println("Second Min: "+secMin(arr));
        System.out.println("Second Max: "+SecMax(arr));

        int[] newArr=reverse(arr);
        System.out.print("reverse array: ");
        for(int num:newArr)
        {
            System.out.print(num+" ");
        }

        Map<Integer, Integer> freqmap = countFreq(arr);
        System.out.println("\nElement Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

         */
        int[] SortingArr = Sorting(arr);
        System.out.print("Sorted Array (Descending):");
        for (int num : SortingArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //System.out.println("Sum of Array: "+sumOfarray(arr));
        //System.out.println("Average: "+avgOfarray(arr));
        //System.out.println("Median: "+median(arr));

        int A=4;
        System.out.println("Element: "+Searching(arr,A));
    }


}
