import java.util.*;

public class IPA23 {
    
    static int findAvgVoyagesByPct(NavalVessel[] arr, int percentage){
        int sum = 0, n =0;
        for(int i =0; i<arr.length; i++){
            int pc = (arr[i].getComp()*100) / (arr[i].getPlan());
            if(pc >= percentage){
                sum += arr[i].getComp(); 
                n++;
            } 
        }
        if(sum == 0) return 0;

        return sum/n;
    }

    static NavalVessel findVesselByGrade(NavalVessel[] arr, String purpose){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getPurpose().equalsIgnoreCase(purpose)){
                int pc = (arr[i].getComp()*100) / (arr[i].getPlan()); 
                if(pc == 100) arr[i].setClassification("Star");
                else if(pc >= 80 && pc <= 99) arr[i].setClassification("Leader");
                else if(pc >= 55 && pc <= 79) arr[i].setClassification("Inspirer");
                else arr[i].setClassification("Striver");
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] arr = new NavalVessel[4];

        for (int i = 0; i < arr.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new NavalVessel(a,b,c,d,e);
        }
        int pc = sc.nextInt(); sc.nextLine();
        String purpose = sc.nextLine();

        int avg = findAvgVoyagesByPct(arr, pc);
        if(pc > 0) System.out.println(avg);
        else System.out.println("No Average found");

        NavalVessel ans = findVesselByGrade(arr, purpose);
        if(ans == null) System.out.println("Grade is not derived");
        else System.out.println(ans.getName() +"%" + ans.getClassification());
        
        sc.close();
    }
}

class NavalVessel
{
    int id, plan, comp;
    String name, purpose;
    String classi;

    public NavalVessel(int id, String name, int plan, int comp, String purpose)
    {
      this.name=name;
        this.plan = plan;
        this.comp = comp;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    
    }

    public void setClassification(String classi){
        this.classi = classi;
    }

    public String getClassification(){
        return classi;
    }
    
}
