/*
 replanish method will take array of Inventory object and a limit as a int parameter.
 and will return another array of inventory objects where the limit int is lesser than or equal to the original array of Inventory object's threshold attribute.

 Before calling 'replanish' method in the main method read the four Inventory objects referring the attributes in above sequece along with a limit.

 Then call the 'replanish' method and write the logic in main method to print inventoryId and 'Critical filling' if the threshold attribute is greater than 75, else if the threshold attribute is between 50 and 75 then print "Moderate Filing" and else print "Non- critical filling"
 */

import java.util.*;;

public class IPA09 {
    
    static Inventory[] replanish(Inventory[] arr, int limit){
        Inventory[] arr2 = new Inventory[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getThreshold() <= limit){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] arr = new Inventory[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b= sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Inventory(a, b, c, d);
        }

        int limit = sc.nextInt(); sc.nextLine();

        Inventory[] ans = replanish(arr, limit);

        for(int i =0; i<ans.length; i++){
            if(ans[i].getThreshold() > 75){
                System.out.println(ans[i].getId()+" Critical Filing");
            }

            else if(ans[i].getThreshold() >= 50 && ans[i].getThreshold() <= 75){
                System.out.println(ans[i].getId()+" Moderate Filing");
            }
            else{
                System.out.println(ans[i].getId()+" Non-Critical Filing");
            }
        }

        sc.close();
    }
}

class Inventory{
    private int inventorId;
    private int maxQuantity;
    private int currQuantity;
    private int threshold;

    Inventory(int inventorId, int maxQuantity, int currQuantity, int threshold){
        this.inventorId = inventorId;
        this.maxQuantity = maxQuantity;
        this.currQuantity = currQuantity;
        this.threshold = threshold;
    }

    public int getId(){
        return inventorId;
    }

    public int getMaxQuant(){
        return maxQuantity;
    }

    public int getCurrQuant(){
        return currQuantity;
    }

    public int getThreshold(){
        return threshold;
    }
}
