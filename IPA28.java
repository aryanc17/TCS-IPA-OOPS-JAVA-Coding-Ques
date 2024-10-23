import java.util.*;

public class IPA28 {
    
    static Associate[] associatesForGivenTechnology(Associate[] arr, String tech){
        Associate[] arr2 = new Associate[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getTech().equals(tech)){
                if(arr[i].getYear()%5==0){
                    arr2 = Arrays.copyOf(arr2, arr2.length+1);
                    arr2[arr2.length-1] =arr[i];
                }
            }
        }
        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] arr = new Associate[5];

        for(int i =0; i<5; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Associate(a, b, c, d);
        }
        String tech = sc.nextLine();

        Associate[] ans = associatesForGivenTechnology(arr, tech);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getId());
            }
        }
        else{
            System.out.println("No such associate available");
        }

        sc.close();
    }
}

class Associate
{
    private int id;
    private String name;
    private String tech;
    private int year;

    public Associate(int id, String name, String tech, int year) {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.year = year;
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
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}
