import java.util.Arrays;
import java.util.Scanner;

public class IPA25 {
    
    static int searchAntennaByName(Antenna[] arr, String name){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i].getId();
            }
        }
        return 0;
    }

    static Antenna[] sortAntennaByVSWR(Antenna[] arr, double VSWR){
        Antenna[] arr2 = new Antenna[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getVSWR() < VSWR){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }

        for(int i =0; i<arr2.length; i++){
            for(int j = i+1; j<arr2.length; j++){
                if(arr2[i].getVSWR() > arr2[j].getVSWR()){
                    Antenna temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length > 0) return arr2;
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antenna[] arr = new Antenna[4];

        for(int i =0; i < arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Antenna(a, b, c, d);
        }
        String name = sc.nextLine();
        double vswr = sc.nextDouble(); sc.nextLine();

        int id = searchAntennaByName(arr, name);
        if(id > 0) System.out.println(id);
        else System.out.println("There is no antenna with the given parameter");

        Antenna[] ans = sortAntennaByVSWR(arr, vswr);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getLead());
            }
        }
        else System.out.println("No Antenna found");

        sc.close();
    }
}

class Antenna
{
	private int id;
	private String name,lead;
	private double VSWR;
	public Antenna(int id, String name, String lead, double VSWR)
	{
		this.id = id;
		this.name = name;
		this.lead = lead;
		this.VSWR = VSWR;
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
	public String getLead()
	{
		return lead;
	}
	public void setLead(String lead)
	{
		this.lead = lead;
	}
	public double getVSWR()
	{
		return VSWR;
	}
	public void setVSWR(double VSWR)
	{
		this.VSWR=VSWR;
	}
}

