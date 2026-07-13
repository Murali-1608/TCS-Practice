/*
Problem Statement
Create a class Inventory with the following attributes:
inventoryId (String)
maximumQuantity (int)
currentQuantity (int)
threshold (int) The class should have a parameterised constructor and getters/setters (though setters are often optional in the exam logic).
Create a class Solution with the following static method:
replenish: This method takes an array of Inventory objects and an int value (limit) as parameters.
 It should return an array of Inventory objects where the threshold value is less than or equal to the given limit.
Main Method Requirements:
Read data for 4 Inventory objects.
Read an additional int for the limit.
Call the replenish method.
For each object in the returned array, print the inventoryId.
Additionally, check the threshold value of each returned object: if the threshold is 75 or less, print "Critical Filling"; otherwise, print "Moderate Filling".
 */

package OOPS;
import java.util.*;

class Inventory
{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold)
    {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId()
    {
        return inventoryId;
    }

    public int getMaximumQuantity()
    {
        return maximumQuantity;
    }

    public int getCurrentQuantity()
    {
        return currentQuantity;
    }

    public int getThreshold()
    {
        return threshold;
    }

    public void setInventoryId(String inventoryId)
    {
        this.inventoryId = inventoryId;
    }

    public void setMaximumQuantity(int maximumQuantity)
    {
        this.maximumQuantity = maximumQuantity;
    }

    public void setCurrentQuantity(int currentQuantity)
    {
        this.currentQuantity = currentQuantity;
    }

    public void setThreshold(int threshold)
    {
        this.threshold = threshold;
    }
}

public class Ques_07
{

    public static Inventory[] replenish(Inventory[] invent, int value)
    {
        Inventory[] result = new Inventory[invent.length];
        int count = 0;

        for(int i=0;i<invent.length;i++)
        {
            if(invent[i].getThreshold()<=value)
            {
                result[count]=invent[i];
                count++;
            }
        }

        if(count==0)
        {
            return null;
        }

        Inventory[] ans = new Inventory[count];

        for(int i=0;i<count;i++)
        {
            ans[i]= result[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Inventory[] invent = new Inventory[3];

        for(int i=0;i<invent.length;i++)
        {
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt(); sc.nextLine();
            int currentQuantity = sc.nextInt();sc.nextLine();
            int threshold = sc.nextInt();sc.nextLine();

            invent[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        int value = sc.nextInt();
        Inventory[] result = replenish(invent,value);

        if(result != null)
        {
            for(Inventory inv:result)
            {
                System.out.println(inv.getInventoryId());
            }

            if(inv.getThreshold() <= 75)
        }
    }
}
