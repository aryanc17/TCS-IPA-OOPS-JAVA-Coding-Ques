import java.util.Arrays;
import java.util.Scanner;

public class IPA31 {
    
    static Sim2[] matchAndSort(Sim2[] arr, String circle, double search_rate){
        Sim2[] arr2 = new Sim2[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle)){
                if(search_rate > arr[i].getRps()){
                    arr2 = Arrays.copyOf(arr2, arr2.length+1);
                    arr2[arr2.length-1] = arr[i];
                }
            }
        }
        Arrays.sort(arr2, (a,b)-> Integer.compare(b.getBalance(), a.getBalance()));

        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim2[] arr = new Sim2[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Sim2(a,b,c,d,e);
        }

        String circle = sc.nextLine();
        double sr = sc.nextDouble(); 

        Sim2[] ans = matchAndSort(arr, circle, sr);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getId());
            }
        }
        else{
            System.out.println("No entries found");
        }

        sc.close();
    }
}

class Sim2
{
    private int id;
    private String company;
    private int balance;
    private double rps;
    private String circle;
    public Sim2(int id, String company, int balance, double rps, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.rps = rps;
        this.circle = circle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getRps() {
        return rps;
    }
    public void setRps(double rps) {
        this.rps = rps;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }

    
}
