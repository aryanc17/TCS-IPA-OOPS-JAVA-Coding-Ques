import java.util.Arrays;
import java.util.Scanner;

public class IPA40 {
    
    static double findSongDurationForArtist(Song[] arr, String artist){
        double total = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getArtist().equalsIgnoreCase(artist)){
                total += arr[i].getDuration();
            }
        }
        return total;
    }

    static Song[] getSongsInAscendingOrder(Song[] arr, String artist){
        Song[] arr2 = new Song[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getArtist().equalsIgnoreCase(artist)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        Arrays.sort(arr2, (a,b) -> Double.compare(a.getDuration(), b.getDuration()));

        if(arr2.length > 0) return arr2;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] arr = new Song[5];

        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Song(a,b,c,d);
        }

        String artist1 = sc.nextLine();
        String artist2 = sc.nextLine();

        double duration = findSongDurationForArtist(arr, artist1);
        if(duration > 0) System.out.println(duration);
        else System.out.println("There are no songs with given artist");

        Song[] ans = getSongsInAscendingOrder(arr, artist2);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getId());
                System.out.println(ans[i].getTitle());
            }
        }
        else  System.out.println("There are no songs with given artist");

        sc.close();
    }
}

class Song
{
    int id;
    String title;
    String artist;
    double duration;
    public Song(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}
