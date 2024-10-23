import java.util.*;

public class IPA15 {
    
    static int totalNoOfRoomsBooked(Motel [] arr, String cabFacility){
        for(int i =0; i < arr.length; i++){
            if(arr[i].getCabFacility().equalsIgnoreCase(cabFacility)){
                if(arr[i].getNoOfRoomsBooked() > 5){
                    return arr[i].getNoOfRoomsBooked();
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel[] arr = new Motel[4];

        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            arr[i] = new Motel(a,b,c,d,e,f);
        }
        String cabFacility = sc.nextLine();

        int rooms = totalNoOfRoomsBooked(arr, cabFacility);
        if(rooms > 0){
            System.out.println(rooms);
        }
        else{
            System.out.println("No such rooms booked");
        }

        sc.close();
    }
}

class Motel
{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
    {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public int getMotelId()
    {
        return motelId;
    }
    public void setMotelId(int motelId)
    {
        this.motelId = motelId;
    }
    public String getMotelName()
    {
        return motelName;
    }
    public void setMotelName(String motelName)
    {
        this.motelName = motelName;
    }
    public String getDateOfBooking()
    {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking)
    {
        this.dateOfBooking= dateOfBooking;
    }
    public int getNoOfRoomsBooked()
    {
        return noOfRoomsBooked;
    }
    public void setNoOfRoomBooked(int noOfRoomsBooked)
    {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public String getCabFacility()
    {
        return cabFacility;
    }
    public void setCabFacility(String cabFacility)
    {
        this.cabFacility = cabFacility;
    }
    public double getTotalBill()
    {
        return totalBill;
    }
    public void setTotalBill(double totalBill)
    {
        this.totalBill = totalBill;
    } 
}
