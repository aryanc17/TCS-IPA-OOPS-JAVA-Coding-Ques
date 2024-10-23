import java.util.Arrays;
import java.util.Scanner;

public class IPA11 {
    
    static Medicine[] getPriceByDisease(Medicine[] arr, String disease){
        Medicine[] arr2 = new Medicine[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
                Arrays.sort(arr2);
            }
        }

        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[3];

        for(int i =0; i<arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a, b, c, d);
        }
        String disease = sc.nextLine();

        Medicine[] ans = getPriceByDisease(arr, disease);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getPrice());
            }
        }
        else{
            System.out.println("No Medicine found");
        }
        

        sc.close();
    }
}

class Medicine{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    Medicine(String medicineName, String batch, String disease, int price){
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName(){
        return medicineName;
    }

    public String getBatch(){
        return batch;
    }

    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }
}