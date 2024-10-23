import java.util.Scanner;

public class IPA03 {
    
    public static Cricketer findCricketerWithMinimum(Cricketer[] arr ){
        int min = arr[0].getMatchesPlayed();
        Cricketer minObj = arr[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getMatchesPlayed() < min){
                min = arr[i].getMatchesPlayed();
                minObj = arr[i];
            }
        }

        return minObj;
    }

    public static Cricketer searchCricketer(Cricketer[] arr, int cricketerId){
        for(int i =0; i<arr.length; i++){
            if(cricketerId == arr[i].getCricketerId()){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Cricketer[] arr = new Cricketer[n];

        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Cricketer(a, b, c, d, e);
        }

        int id = sc.nextInt();
        Cricketer ans1 = findCricketerWithMinimum(arr);
        System.out.println(ans1.getCricketerId());
        System.out.println(ans1.getMatchesPlayed());

        Cricketer ans2 = searchCricketer(arr, id);

        if(ans2 == null){
            System.out.println("No Such cricketer");
        }

        else{
            System.out.println(ans2.getCricketerName());
            System.out.println(ans2.getCricketerName());
        }
        sc.close();
    }
}

class Cricketer{
    private int cricketerId;
    private int matchesPlayed;
    private int totalRuns;
    private String cricketerName;
    private String team;

    Cricketer(int cricketerId, int matchesPlayed, int totalRuns, String cricketerName, String team){
        this.cricketerId = cricketerId;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.cricketerName = cricketerName;
        this.team = team;
    }

    public int getCricketerId(){
        return cricketerId;
    }

    public int getMatchesPlayed(){
        return matchesPlayed;
    }

    public int getTotalRuns(){
        return totalRuns;
    }

    public String getCricketerName(){
        return cricketerName;
    }

    public String getTeam(){
        return team;
    }
}
