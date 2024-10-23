import java.util.Arrays;
import java.util.Scanner;

public class IPA20 {
    
    static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String branch){
        int count = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getTransport()){
                if(arr[i].getBranch().equalsIgnoreCase(branch)){
                    count++;
                }
            }
        }
        return count;
    }

    static Employee findEmployeeWithSecondHighestRating(Employee[] arr){
        double[] arr2 = new double[0];

        for(int i =0; i<arr.length; i++){
            if(!arr[i].getTransport()){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i].getRating();
            }
        }

        Arrays.sort(arr2);
        double second = arr2[arr2.length-2];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getRating() == second){
                return arr[i];
            }
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[4];

        for (int i = 0; i < arr.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            arr[i] = new Employee(a,b,c,d,e);
        }
        String branch = sc.nextLine();

        int count = findCountOfEmployeesUsingCompTransport(arr, branch);

        if(count > 0){
            System.out.println(count);
        }
        else System.out.println("No such Employees");

        Employee ans = findEmployeeWithSecondHighestRating(arr);

        if(ans == null) System.out.println("All Employees using company transport");

        else{
            System.out.println(ans.getId());
            System.out.println(ans.getName());
        }

        sc.close();
    }
}

class Employee
{
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int Id, String name, String branch, double rating, boolean transport)
    {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public boolean getTransport()
    {
        return transport;
    }
    public void setTransport(boolean transport)
    {
        this.transport= transport;
    }
}