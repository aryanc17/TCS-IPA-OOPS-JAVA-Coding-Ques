import java.util.Arrays;
import java.util.Scanner;

public class IPA10 {
    
    static Movie[] getMovieByGenre(Movie[] arr, String genre){
        Movie[] arr2 = new Movie[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i].getGenre().equals(genre)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[3];

        for(int i =0; i < arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            
            arr[i] = new Movie(a, b, c, d);
        }

        String genre = sc.nextLine();

        Movie[] ans = getMovieByGenre(arr, genre);

        for(int i =0; i<ans.length; i++){
            if(ans[i].getBudget() > 80000000){
                System.out.println("High Budget Movie");
            }
            else{
                System.out.println("Low Budget Movie");
            }
        }

        sc.close();
    }
}

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    Movie(String movieName, String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getName(){
        return movieName;
    }

    public String getCompany(){
        return company;
    }

    public String getGenre(){
        return genre;
    }

    public int getBudget(){
        return budget;
    }
}
