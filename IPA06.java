import java.util.Scanner;

public class IPA06 {
    
    static Fruits findMaximumPriceByRating(Fruits[] arr, int rating){
        int min = arr[0].getPrice();
        Fruits obj = null;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getRating() > rating){
                if(min < arr[i].getPrice()){
                    min = arr[i].getPrice();
                    obj = arr[i];
                }            
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruits[] arr = new Fruits[4];

        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Fruits(a, b, c, d);
        }

        int rating = sc.nextInt(); sc.nextLine();

        Fruits obj = findMaximumPriceByRating(arr, rating);
        if(obj != null){
            System.out.println(obj.getId());
        }
        else{
            System.out.println("No Such Fruit");
        }


        sc.close();
    }
}

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    Fruits(int fruitId, String fruitName, int price, int rating){
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getId(){
        return fruitId;
    }

    public String getName(){
        return fruitName;
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }
}
