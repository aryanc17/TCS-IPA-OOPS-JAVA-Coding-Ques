import java.util.*;

public class IPA36 {
    
    static int findTotalPriceByPublicationYear(Newspaper[] arr, int year){
        int total = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getPublicationYear() == year){
                total += arr[i].getPrice();
            }
        }
        return total;
    }

    static Newspaper searchNewspaperByName(Newspaper[] arr, String name){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Newspaper[] arr = new Newspaper[4];

        for(int i =0; i < arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Newspaper(a,b,c,d);
        }
        int year = sc.nextInt(); sc.nextLine();
        String name = sc.nextLine();

        int total = findTotalPriceByPublicationYear(arr, year);
        if(total > 0) System.out.println(total);
        else System.out.println("No Newspaper found with the mentioned attribute");

        Newspaper ans= searchNewspaperByName(arr, name);

        if(ans != null){
            System.out.println(ans.getRegNo() + " " + ans.getName() + " " + ans.getPublicationYear() + " " + ans.getPrice());
        }
        else{
            System.out.println("No Newspaper found with the given name.");
        }


        sc.close();
    }
}

class Newspaper{
    int regNo;
    String name;
    int publicationYear;
    int price;

    public Newspaper(int regNo, String name, int publicationYear, int price)
    {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo()
    {
        return regNo;
    }
    public void setRegno(int regNo)
    {
        this.regNo=regNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getPublicationYear()
    {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
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
