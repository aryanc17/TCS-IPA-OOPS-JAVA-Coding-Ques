import java.util.*;

public class IPA35 {
    
    static int findAvgOfCount(Music[] arr, int count){
        int sum = 0, n = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getCount() > count){
                sum += arr[i].getCount();
                n++;
            }
        }
        if(n > 0) return sum/n;

        return 0;
    }

    static Music[] sortTypeByDuration(Music[] arr, double duration){
        Music[] arr2 = new Music[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i].getDuration() > duration){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        Arrays.sort(arr2, (a, b) -> Double.compare(a.getDuration(), b.getDuration()));

        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music[] arr = new Music[4];

        for(int i = 0; i<arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            arr[i] = new Music(a,b,c,d);
        }

        int count = sc.nextInt(); sc.nextLine();
        double duration = sc.nextDouble();

        int avg = findAvgOfCount(arr, count);

        if(avg != 0){
            System.out.println(avg);
        }
        else{
            System.out.println("No playlist found");
        }

        Music[] ans = sortTypeByDuration(arr, duration);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getType());
            }
        }
        else{
            System.out.println("No playlist found with mentioned attribute");
        }

        sc.close();
    }
}

class Music
{
    int pNo, count;
    String type;
    double duration;
    
    public Music(int pNo, String type, int count, double duration)
    {
        this.pNo = pNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    
    public int getPNo()
    {
        return pNo;
    }
    public void setPNo(int pNo)
    {
        this.pNo = pNo;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDuration(double duration)
    {
        this.duration = duration;
    }
}
