import java.util.*;

public class IPA37 {
    
    static Player3[] findPlayerName(Player3[] arr, String country, int run){
        Player3[] arr2 = new Player3[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i].getCountry().equals(country) && arr[i].getRun() > run){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        
        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Player3[] arr = new Player3[n];

        for(int i =0; i < n; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Player3(a,b,c,d,e);
        }

        String county = sc.nextLine();
        int run = sc.nextInt();

        Player3[] ans = findPlayerName(arr, county, run);

        if(ans != null){
            for(int i =0; i < ans.length; i++){
                System.out.println(ans[i].getId() + " " + ans[i].getName());
            }
        }

        else{
            System.out.println("No player found");
        }

        sc.close();
    }


}

class Player3
{
    private int id;
    private String name;
    private String country;
    private int match;
    private int run;
    public Player3(int id, String name, String country, int match, int run) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.match = match;
        this.run = run;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getMatch() {
        return match;
    }
    public void setMatch(int match) {
        this.match = match;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    
}
