import java.util.Scanner;

class IPA29{

    static int findAvgBudgetByDirector(Cinema[] arr, String director){
        int sum =0, n = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getDirector().equalsIgnoreCase(director)){
                sum += arr[i].getBudget();
                n++;
            }
        }
        if(n > 0) return sum/n;

        return 0;
    }

    static Cinema getMovieByRatingBudget(Cinema[] arr, int rating, int budget){
        for(int i =0; i < arr.length; i++){
            if(arr[i].getRating() == rating && budget % rating == 0){
                if(arr[i].getBudget() == budget){
                    return arr[i];
                }
            }
        }
        return null;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema[] arr = new Cinema[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Cinema(a, b, c, d);
        }

        String director = sc.nextLine();
        int rating = sc.nextInt(); sc.nextLine();
        int budget = sc.nextInt(); sc.nextLine();

        int avgBudget = findAvgBudgetByDirector(arr, director);
        if(avgBudget > 0) System.out.println(avgBudget);
        else System.out.println("Sorry - The given director has not yet directed any movie");

        Cinema ans = getMovieByRatingBudget(arr, rating, budget);

        if(ans != null) System.out.println(ans.getId());
        else System.out.println("Sorry - No movie is available with the specified rating and budget requirement");

        sc.close();
    }
}

class Cinema
{
    private int id;
    private String director;
    private int rating, budget;

    public Cinema(int id, String director, int rating, int budget) {
        this.id = id;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }

    
}