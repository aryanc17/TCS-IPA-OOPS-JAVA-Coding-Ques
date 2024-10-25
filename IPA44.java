import java.util.Scanner;

public class IPA44 {
    
    static BankAccount withdraw(BankAccount[] arr, int acNum){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getAcNo() == acNum){
                return arr[i];
            }
        }
        return null;
    }

    static BankAccount deposit(BankAccount[] arr, int acNum){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getAcNo() == acNum){
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] arr = new BankAccount[3];

        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();

            arr[i] = new BankAccount(a,b,c);
        }

        int acNo1 = sc.nextInt(); sc.nextLine();
        double withdraw = sc.nextDouble(); sc.nextLine();
        int acNo2 = sc.nextInt(); sc.nextLine();
        double deposit = sc.nextDouble(); sc.nextLine();

        BankAccount ans1 = withdraw(arr, acNo1);

        if(ans1!= null){
            if(ans1.getBalance() >= withdraw){
                ans1.setBalance(ans1.getBalance()-withdraw);
                System.out.println(ans1.getBalance());
            }
            else System.out.println("Not sufficient balance");
        }
        else System.out.println("Account number doesn't exist");

        BankAccount ans2 = deposit(arr, acNo2);

        if(ans2 != null){
            ans2.setBalance(ans2.getBalance()+deposit);
            System.out.println(ans2.getBalance());
        }
        else System.out.println("Account number doesn't exist");
        sc.close();
    }
}

class BankAccount
{
    private int acno;
    private String acname;
    private double balance;
    public BankAccount(int acno, String acname, double balance)
    {
        this.acno = acno;
        this.acname = acname;
        this.balance = balance;
    }
    public int getAcNo()
    {
        return acno;
    }
    public void setAcNo(int acno)
    {
        this.acno = acno;
    }
    public String getAcName()
    {
        return acname;
    }
    public void setAcName(String acname)
    {
        this.acname = acname;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
