import java.util.*;

public class IPA41 {
    
    static int findTotalPriceForGivenBrand(HeadSets[] arr, String brand){
        int price = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getBrand().equals(brand)){
                price += arr[i].getPrice();
            }
        }
        return price;
    }

    static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr){
        int[] arr2 = new int[0];

        for(int i = 0; i<arr.length; i++){
            arr2 = Arrays.copyOf(arr2, arr2.length+1);
            arr2[arr2.length-1] = arr[i].getPrice();
        }
        Arrays.sort(arr2);
        int second = arr2[1];

        for(int i =0; i<arr.length; i++){
            if(second == arr[i].getPrice()){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] arr = new HeadSets[4];

        for(int i=  0; i < arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new HeadSets(a,b,c,d);
        }
        String brand = sc.nextLine();

        int price = findTotalPriceForGivenBrand(arr, brand);

        if(price > 0) System.out.println(price);
        else System.out.println("No Headsets available with the given brand");

        HeadSets ans = findAvailableHeadsetWithSecondMinPrice(arr);

        if(ans != null){
            System.out.println(ans.getHname());
            System.out.println(ans.getPrice());
        }
        else{
            System.out.println("No Headsets available");
        }

        sc.close();
    }
}

class HeadSets
{
    private String hname;
    private String brand;
    private int price;
    private boolean available;
    public HeadSets(String hname, String brand, int price,boolean available)
    {
        this.hname = hname;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    public String getHname()
    {
        return hname;
    }
    public void setHname(String hname)
    {
        this.hname = hname;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public boolean getAvailable()
    {
        return available;
    }
    public void setAvailable(boolean available)
    {
        this.available = available;
    }
}
