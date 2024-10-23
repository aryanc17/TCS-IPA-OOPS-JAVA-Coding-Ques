import java.util.Scanner;

public class IPA14 {
    
    static College findCollegeWithMaximumPincode(College[] arr){
        int max = arr[0].getPin();

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getPin() > max){
                max = arr[i].getPin();
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getPin() == max){
                return arr[i];
            }
        }
        return null;
    }

    static College searchCollegeByAddress(College[] arr, String address){

        for(int i =0; i<arr.length; i++){
            if(arr[i].getAddress().equalsIgnoreCase(address)){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        College arr[] = new College[n];

        for (int i=0; i<n; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i]= new College(a,b,c,d,e);
        }

        String address =sc.nextLine();

        College ans1 = findCollegeWithMaximumPincode(arr);
        College ans2 = searchCollegeByAddress(arr, address);

        if(ans1 != null){
            System.out.println("Id : " + ans1.getId());
            System.out.println("Name : " + ans1.getName());
            System.out.println("Contact no : " + ans1.getContactNo());
            System.out.println("Address : " + ans1.getAddress());
            System.out.println("Pincode : " + ans1.getPin());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }


        if(ans2 != null){
            System.out.println("Id : " + ans2.getId());
            System.out.println("Name : " + ans2.getName());
            System.out.println("Contact no : " + ans2.getContactNo());
            System.out.println("Address : " + ans2.getAddress());
            System.out.println("Pincode : " + ans2.getPin());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }

        sc.close();
    }
}

class College
{
    private int id, contactNo, pin;
    private String name, address;

    public College(int id, String name, int contactNo, String address, int pin)
    {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pin = pin;
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
    public int getContactNo()
    {
        return contactNo;
    }
    public void setContactNo(int contactNo)
    {
        this.contactNo = contactNo;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public int getPin()
    {
        return pin;
    }
    public void setPin(int pin)
    {
        this.pin= pin;
    }
}
