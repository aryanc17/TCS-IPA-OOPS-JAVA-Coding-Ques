import java.util.Scanner;

public class IPA05 {
    
    static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int max = arr[0].getPrice();

        for(int i =0; i<arr.length; i++){
            if(arr[i].getPrice() > max){
                max = arr[i].getPrice();
            }
        }
        return max;
    }

    static TravelAgencies agencyDetailForGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType){
        for(int i =0; i<arr.length; i++){
            if((arr[i].getFlightFacility() == true )&&  (arr[i].getRegNo() == regNo && arr[i].getPackageType().equalsIgnoreCase(packageType))){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        TravelAgencies[] arr = new TravelAgencies[size];

        for(int i = 0; i<size; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            boolean e = sc.nextBoolean();

            arr[i] = new TravelAgencies(a, b, c, d, e);
        }

        int regNo = sc.nextInt(); sc.nextLine();
        String packageType = sc.nextLine();

        TravelAgencies ans = agencyDetailForGivenIdAndType(arr, regNo, packageType);
        System.out.println(findAgencyWithHighestPackagePrice(arr));
        System.out.println(ans.getAgencyName() + " : " + ans.getPackageType());

        sc.close();
    }


}

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return regNo;
    }

    public String getAgencyName(){
        return agencyName;
    }

    public String getPackageType(){
        return packageType;
    }

    public int  getPrice(){
        return price;
    }

    public boolean getFlightFacility(){
        return flightFacility;
    }
}
