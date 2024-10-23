import java.util.Scanner;

public class IPA07 {

    static int findPriceForGivenBrand(Phone[] arr, String brand){
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getBrand().equals(brand)){
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }

    static Phone getPhoneIdBasedOnOs(Phone[] arr, String os){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getOs().equals(os)){
                if(arr[i].getPrice() >= 50000){
                    return arr[i];
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Phone(a, b, c, d);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        Phone obj = getPhoneIdBasedOnOs(arr, os);

        int sum = findPriceForGivenBrand(arr, brand);

        if(sum > 0) System.out.println(obj.getPrice());
        else System.out.println("The Given brand is not available");

        if(obj != null )System.out.println(obj.getId());
        else System.out.println("No phones are available with specified os and price range");

        sc.close();
    }
}

class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    Phone(int phoneId, String os, String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getId(){
        return phoneId;
    }

    public String getOs(){
        return os;
    }

    public String getBrand(){
        return brand;
    }

    public int getPrice(){
        return price;
    }
}
