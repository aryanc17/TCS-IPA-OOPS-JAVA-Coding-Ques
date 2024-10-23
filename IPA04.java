import java.util.Scanner;

public class IPA04 {
    
    static int hotelByHighestRating(Hotel[] arr, String cabFacility){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getCabFacility().equalsIgnoreCase(cabFacility) &&  arr[i].getRating() > 5){
                return arr[i].getRating();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hotel[] arr = new Hotel[n];

        for(int i =0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();

            arr[i] = new Hotel(a, b, c, d, e);
        }

        String cab = sc.nextLine();
        int rating = hotelByHighestRating(arr,cab);

        if(rating == 0){
            System.out.println("No Hotel with given facility");
        }
        else{
            System.out.println("Hotel Rating : "+ rating);
        }
        sc.close();
    }
}

class Hotel{
    private int hotelId;
    private String hotelName;
    private String cabFacility;
    private int hotelRating;
    private int hotelFees;

    Hotel(int hotelId, String hotelName, String cabFacility, int hotelRating, int hotelFees){
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.cabFacility = cabFacility;
        this.hotelRating = hotelRating;
        this.hotelFees = hotelFees;
    }

    public int getId(){
        return hotelId;
    }

    public String getName(){
        return hotelName;
    }

    public String getCabFacility(){
        return cabFacility;
    }

    public int getRating(){
        return hotelRating;
    }

    public int getFees(){
        return hotelFees;
    }
}
