import java.util.*;

public class IPA18 {
    
    static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String month){
        int n = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getDate().contains(month)){
                n++;
            }
        }
        return n;
    }

    static Hotel searchHotelByWifiOption(Hotel[] arr, String wifi){
        double[] bills = new double[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i].getWifi().equalsIgnoreCase(wifi)){
                bills = Arrays.copyOf(bills, bills.length+1);
                bills[bills.length-1] = arr[i].getBill();
            }
        }

        if(bills.length == 0) return null;

        Arrays.sort(bills);
        double second = bills[bills.length-2];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getBill() == second){
                return arr[i];
            }
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];

        for (int i = 0; i < arr.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            arr[i]=new Hotel(a,b,c,d,e,f);
        }

        String month = sc.nextLine();
        String wifi = sc.nextLine(); 

        int rooms = noOfRoomsBookedInGivenMonth(arr, month);
        if(rooms>0) System.out.println(rooms);
        else System.out.println("No rooms booked in the given month");

        Hotel ans = searchHotelByWifiOption(arr, wifi);
        if(ans != null){
            System.out.println(ans.getId());
        }
        else{
            System.out.println("No such option available");
        }

        sc.close();
    }
}

class Hotel{
    private int id;
    private String name;
    private String date;
    private int room;
    private String wifi;
    private double bill;

    public Hotel(int id, String name, String date, int room, String wifi, double bill)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
        this.wifi = wifi;
        this.bill = bill;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getRoom()
    {
        return room;
    }
    public void setRoom(int room)
    {
        this.room = room;
    }
    public String getWifi()
    {
        return wifi;
    }
    public void setWifi(String wifi)
    {
        this.wifi = wifi;
    }
    public double getBill()
    {
        return bill;
    }
    public void setBill(double bill)
    {
        this.bill = bill;
    }
}
