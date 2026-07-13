import java.util.*;
public class Practice_01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            arr[i] = new Phone(id,os,brand,price);
        }
        String Sbrand = sc.nextLine();
        String Sos = sc.nextLine();

        int sum = findPriceForGivenBrand(arr,Sbrand);
        if(sum>0)
        {
            System.out.println(sum);
        }
        else {
            System.out.println("The given brand is not avaliable");
        }

        int phoneId=getPhoneIdBasedOnOs(arr,Sos);
        if(phoneId != 0)
        {
            System.out.println(phoneId);
        }
        else {
            System.out.print("None");
        }
    }

    public static int findPriceForGivenBrand(Phone[] arr, String brand)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equals(brand))
            {
                sum=sum+arr[i].getPrice();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        else {
            return 0;
        }
    }

    public static int getPhoneIdBasedOnOs(Phone[] arr,String os)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getOperatingSystem().equals(os) && arr[i].getPrice()>=50000){
                return arr[i].getphoneId();
            }
        }
        return 0;
    }



    static class Phone
    {
        int phoneId;
        String operatingSystem;
        String brand;
        int price;

        // Constructor
        public Phone(int phoneId, String operatingSystem, String brand, int price)
        {
            this.phoneId = phoneId;
            this.operatingSystem = operatingSystem;
            this.brand = brand;
            this.price=price;
        }

        // Getter

        public int getphoneId(){
            return phoneId;
        }

        public String getOperatingSystem(){
            return operatingSystem;
        }

        public String getBrand(){
            return brand;
        }

        public int getPrice(){
            return price;
        }
    }


}
