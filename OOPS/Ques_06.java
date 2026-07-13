/*
Create a class Medicine with the following attributes:
medicineName (String)
batch (String)
disease (String)
price (int)
The attributes should be private. Write a parameterised constructor and the necessary getters and setters for all attributes.

Create a class Solution which contains the main method.
 Implement the following static method in the Solution class:

getPriceByDisease: This method takes an array of Medicine objects and a String (disease name) as parameters.
 It searches for all medicines that match the given disease (case-insensitive).
 The method should return an array of integers containing the prices of the matched medicines, sorted in ascending order.

3. Main Method Requirements:
Use a Scanner object to read data for 4 Medicine objects.
Read an additional String value for the disease.
Call the getPriceByDisease method.
Print the results (prices) from the returned integer array one by one.

*/
package OOPS;
import java.util.*;

class Medicine
{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    Medicine(String medicineName, String batch, String disease, int price)
    {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName()
    {
        return medicineName;
    }

    public String getBatch()
    {
        return batch;
    }

    public String getDisease()
    {
        return disease;
    }

    public int getPrice()
    {
        return price;
    }

    public void setMedicineName(String medicineName)
    {
        this.medicineName=medicineName;
    }

    public void setBatch(String batch)
    {
        this.batch = batch;
    }

    public void setDisease(String disease)
    {
        this.disease=disease;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }
}

public class Ques_06
{

    public static int[] getPriceByDisease(Medicine[] med, String Disease)
    {
        int[] res = new int[med.length];
        int count=0;
        for(int i=0;i<med.length;i++)
        {
            if(med[i].getDisease().equalsIgnoreCase(Disease)) {
                res[count] = med[i].getPrice();
                count++;
            }
        }
        if(count==0) {
            return null;
        }

        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(res[j]>res[j+1])
                {
                    int temp = res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                }
            }
        }

        int[] ans = new int[count];

        for(int i=0;i<count;i++)
        {
            ans[i]=res[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Medicine[] med = new Medicine[4];

        for(int i=0;i<med.length;i++)
        {
            String MedName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            med[i] = new Medicine(MedName, batch, disease, price );
        }

        String dis = sc.nextLine();

        int[] result = getPriceByDisease(med, dis);

        if(result != null)
        {
            for(int price:result)
            {
                System.out.println(price);
            }
        }
    }
}
