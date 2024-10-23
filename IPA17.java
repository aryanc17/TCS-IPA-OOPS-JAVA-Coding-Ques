import java.util.*;

public class IPA17 {
    
    static Sim[] transferCustomerCircle(Sim[] arr, String circle1, String circle2){
        Sim[] arr1 = new Sim[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle1)){
                arr1 = Arrays.copyOf(arr1, arr1.length+1);
                arr[i].circle = circle2;
                arr1[arr1.length-1] = arr[i];
            }
        }

        for(int i =0; i < arr1.length; i++){
            for(int j = i+1; j<arr1.length; j++){
                if(arr1[i].getRatePerSecond() < arr1[j].getRatePerSecond()){
                    Sim temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        if(arr1.length > 0) return arr1;
        else return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] arr = new Sim[5];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            arr[i]=new Sim(a,b,c,d,e);
        }

        String c1 = sc.nextLine();
        String c2 = sc.nextLine();

        Sim[] ans = transferCustomerCircle(arr, c1, c2);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getSimId() + " " + ans[i].getCustomerName()+" " + ans[i].getCircle() + " "  + ans[i].getRatePerSecond());
            }
        }

        else{
            System.out.println("No Record");
        }


        sc.close();

    }
}

class Sim
{
    int simId;
    String customerName, circle;
    double balance, ratePerSecond;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle)
    {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId()
    {
        return simId;
    }
    public void setSimId(int simId)
    {
        this.simId = simId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getRatePerSecond()
    {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond)
    {
        this.ratePerSecond = ratePerSecond;
    }
    public String getCircle()
    {
        return circle;
    }
    public void setCircle(String circle)
    {
        this.circle = circle;
    }
}
