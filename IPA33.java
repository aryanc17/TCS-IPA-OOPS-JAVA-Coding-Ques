import java.util.Scanner;

public class IPA33 {
    
    static double getTotalInterest(Account[] arr,int id,  int year){
        double totalInt = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getId() == id){
                double pc = (arr[i].getInterestRate() * 100)/year;
                totalInt = pc + arr[i].getInterestRate();
            }
        }
            return totalInt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] arr = new Account[3];

        for(int i =0; i<3; i++){
            int a = sc.nextInt(); sc.nextLine();
            double b = sc.nextDouble(); sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();

            arr[i] = new Account(a,b,c);
        }
        int id = sc.nextInt(); sc.nextLine();
        int year = sc.nextInt(); 

        double ans = getTotalInterest(arr, id,  year);
        System.out.println(ans);

        sc.close();
    }
}

class Account
{
	int id;
	double balance;
	double interestRate;
	
	public Account(int id, double balance, double interestRate)
	{
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
}
