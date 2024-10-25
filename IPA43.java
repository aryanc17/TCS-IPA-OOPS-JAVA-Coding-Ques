import java.util.*;

public class IPA43 {
    
    static Car findMostExpensiveCar(Car[] arr){
        if(arr.length == 0) return null;
        double max = arr[0].getPrice();
        Car obj = arr[0];

        for(int i =1; i<arr.length; i++){
            if(arr[i].getPrice() > max){
                max = arr[i].getPrice();
                obj = arr[i];
            }
        }
        return obj;
    }

    static Car getCarByMakeAndModel(Car[] arr, String make, String model){
        for(int i =0; i<arr.length; i++){
            if((arr[i].getMake().equals(make)) && (arr[i].getModel().equals(model))){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[4];

        for(int i = 0; i<arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Car(a,b,c,d);
        }

        String make = sc.nextLine();
        String model = sc.nextLine();

        Car ans1 = findMostExpensiveCar(arr);

        if(ans1 != null){
            System.out.println(ans1.getMake());
            System.out.println(ans1.getModel());
            System.out.println(ans1.getYear());
            System.out.println(ans1.getPrice());
        }
        else{
            System.out.println("Sorry - No car is available");
        }

        Car ans2 = getCarByMakeAndModel(arr, make, model);

        if(ans2 != null){
            System.out.println(ans2.getYear());
            System.out.println(ans2.getPrice());
        }
        else System.out.println("Sorry - No car is available");

        sc.close();
    }
}

class Car
{
    private String make;
    private String model;
    private int year;
    private double price;
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
