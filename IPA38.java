import java.util.*;

public class IPA38 {
    
    static Car[] removeAndRearrange(Car[] arr, int id){
        Car[] arr2 = new Car[0];

        for(int i =0; i<arr.length ; i++){
            if(arr[i].getId() != id){
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
        Car[] arr = new Car[5];
        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            arr[i] = new Car(a,b,c);
        }
        int id = sc.nextInt();

        Car[] ans = removeAndRearrange(arr, id);

        if(ans != null){
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getId() + " : " + ans[i].getName());
            }
        }
        else {
            System.out.println("There are no car with given id");
        }

        sc.close();
    }
}

class Car
{
    private int id;
    private String name;
    private String type;
    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
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
    
}
