import java.util.*;

public class IPA27 {
    
    static int findAvgEnginePriceByType(Engine[] arr, String type){
        int sum =0, n = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getType().equalsIgnoreCase(type)){
                sum += arr[i].getPrice();
                n++;
            }
        }
        if(n > 0) return sum/n;

        return 0;
    }

    static Engine[] searchEngineByName(Engine[] arr, String name){
        Engine[] arr2 = new Engine[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equals(name)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }

        Arrays.sort(arr2, (a,b) -> Integer.compare(a.getId(), b.getId()));

        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] arr = new Engine[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Engine(a, b, c, d);
        }

        String type = sc.nextLine();
        String name = sc.nextLine();

        int avgByType = findAvgEnginePriceByType(arr, type);
        if(avgByType > 0) System.out.println(avgByType);
        else System.out.println("There are no engine with given type");

        Engine[] ans = searchEngineByName(arr, name);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getId());
            }
        }
        else System.out.println("There are no engine with the given name");
        sc.close();
    }
}

class Engine
{
    private int id;
    private String name;
    private String type;
    private double price;
    public Engine(int id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
