package OOPS;
import java.util.*;
class Laptop {
    private int laptopId;
    private String brand;
    private String processor;
    private int price;

    Laptop(int laptopId, String brand, String processor, int price)
    {
        this.laptopId = laptopId;
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    public int getLaptopId()
    {
        return laptopId;
    }
    public String getBrand()
    {
        return brand;

    }
    public String getProcessor()
    {
        return processor;

    }
    public int getPrice()
    {
        return price;
    }

    public void setLaptopId(int laptopId)
    {
        this.laptopId = laptopId;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setProcessor(String processor)
    {
        this.processor=processor;
    }
    public void setPrice(int Price)
    {
        this.price=price;
    }
}
public class Ques_08
{
    public static Laptop[] findLaptop(Laptop[] laptop, String Searchproc)
    {
        Laptop[] result = new Laptop[laptop.length];
        int count=0;

        for(Laptop laps:laptop)
        {
            if(laps.getProcessor().equalsIgnoreCase(Searchproc))
            {
                result[count]=laps;
                count++;
            }
        }
        if(count==0)
        {
            return null;
        }

        Laptop[] ans = new Laptop[count];
        for(int i=0;i<count;i++)
        {
            ans[i]=result[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Laptop[] lap = new Laptop[3];

        for(int i=0;i<lap.length;i++)
        {
            int LapId = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            String proc = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            lap[i] = new Laptop(LapId, brand, proc, price);
        }

        String Searchproc = sc.nextLine();

        Laptop[] result = findLaptop(lap, Searchproc);

        if(result != null)
        {
            for(Laptop laptops:result)
            {
                System.out.println(laptops.getLaptopId());
            }
        }
    }
}
