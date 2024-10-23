import java.util.*;

public class IPA26 {

    static Flower findMinPriceByType(Flower [] arr, String type){
        int min = arr[0].getPrice();
        Flower obj = null;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getType().equalsIgnoreCase(type)){
                if(arr[i].getRating() > 3 && arr[i].getPrice() < min){
                    min = arr[i].getPrice();
                    obj = arr[i];
                }
            }
        }
        return obj;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flower[] arr = new Flower[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			String e = sc.nextLine();
			
			arr[i] = new Flower(a,b,c,d,e);
        }

        String type = sc.nextLine();

        Flower ans = findMinPriceByType(arr, type);
        if(ans != null) System.out.println(ans.getFlowerId());
        else System.out.println("There is no flower with given type");

        sc.close();
    }
}

class Flower
{
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	
	public Flower(int flowerId, String flowerName, int price, int rating, String type)
	{
		this.flowerId = flowerId;
		this.flowerName= flowerName;
		this.price = price;
		this.rating = rating;
		this.type = type;
	}
	
	public int getFlowerId()
	{
		return flowerId;
	}
	public void setFlowerId(int flowerId)
	{
		this.flowerId = flowerId;
	}
	public String getFlowerName()
	{
		return flowerName;
	}
	public void setFlowerName(String flowerName)
	{
		this.flowerName = flowerName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
}
