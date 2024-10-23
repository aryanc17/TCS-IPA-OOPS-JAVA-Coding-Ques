/*
 Create a class MobileDetails with the below attributes:

MobileId – int
Price - int
Brand – String
isFlagShip – boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MobileDetails with main method.

Implement two static methods – getTotalPrice() and getSecondMin() in MobileDetails class.

getTotalPrice method: 
----------------------------------------
This method will take two int input parameters which take object array and string brand. The method will return the total
price of mobiles of that brand.

If no mobile with the given brand is present in the array of MobileDetails objects, then the method should return 0.

getSecondMin method: 
----------------------------------------
This method will take object array which will return the second minimum price from the array and name of that mobile brand.

The above mentioned static methods should be called from the main method.

For getTotalPrice method: The main method should print the total price as it is, if the returned 
value is not null, or it should print “There are no mobile with given brand”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence.

Input :
---------------------------------------
101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung

Output :
-----------------------------------------
65000
Samsung : 25000
Realme : 25000
 */

import java.util.Arrays;
import java.util.Scanner;

public class IPA39 {
    
    static int getTotalPrice(MobileDetails[] arr, String brand){
        int total = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                total += arr[i].getPrice();
            }
        }
        return total;
    }

    static MobileDetails[] getSecondMin(MobileDetails[] arr){
       int price [] = new int[0];

       for(int i =0; i<arr.length; i++){
            price = Arrays.copyOf(price, price.length+1);
            price[price.length-1] = arr[i].getPrice();
       }

       Arrays.sort(price);
       int sec = price[1];
       MobileDetails[] arr2 = new MobileDetails[0];

       for(int i =0; i<arr.length; i++){
        if(arr[i].getPrice() == sec){
            arr2 = Arrays.copyOf(arr2, arr2.length+1);
            arr2[arr2.length-1] = arr[i];
        }
       }
       if(arr2.length > 0) return arr2;

       return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileDetails[] arr = new MobileDetails[5];

        for(int i =0; i < arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new MobileDetails(a, b, c, d);
        }

        String brand = sc.nextLine();

        int price = getTotalPrice(arr, brand);
        if(price > 0) System.out.println(price);
        else System.out.println("There are no mobile with given brand");

        MobileDetails[] ans = getSecondMin(arr);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getBrand() + " : " + ans[i].getPrice());
            }
        }
        else System.out.println("There is no second min price available");


        sc.close();
    }


}

class MobileDetails
{
    private int id;
    private int price;
    private String brand;
    private boolean isFlagShip;
    
    public MobileDetails(int id, int price, String brand, boolean isFlagShip) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isFlagShip() {
        return isFlagShip;
    }
    public void setFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }
    
}
