import java.util.*;

class IPA12{

    static int getCountByType(Footwear[] arr, String type){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }

    static Footwear getSecondHighestPriceByBrand(Footwear[] arr, String name){
        int[] price = new int[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                price = Arrays.copyOf(price, price.length+1);
                price[price.length-1] = arr[i].getPrice();
            }
        }
        Arrays.sort(price);
        int second = price[price.length-2];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                if(arr[i].getPrice() == second){
                    return arr[i];
                }
            }
        }

        return null;
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] arr= new Footwear[5];

        for(int i =0; i < 5; i++)
        {
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();

			arr[i]=new Footwear(a,b,c,d);
		}
        String type = sc.nextLine();
        String name = sc.nextLine(); 
        int count = getCountByType(arr, type);
        if(count > 0) System.out.println(count);
        else System.out.println("Footwear not available");

        Footwear ans = getSecondHighestPriceByBrand(arr, name);

        if(ans != null){
            System.out.println(ans.getId());
            System.out.println(ans.getName());
            System.out.println(ans.getPrice());
        }
        else {
            System.out.println("Brand not available");
        }

        sc.close();
    }
}

class Footwear{
    private int id;
	private String name;
	private String type;
	private int price;

	public Footwear(int id, String name, String type, int price)
	{
		this.id=id;
		this.name = name;
		this.type = type;
		this.price = price;
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
		this.name=name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}