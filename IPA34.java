import java.util.*;

public class IPA34 {
    
    static Document[] docsWithOddPages(Document[] arr){
        Document[] arr2 = new Document[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getPages() % 2 == 1){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        Arrays.sort(arr2, (a, b) -> Integer.compare(a.getId(), b.getId()));
        if(arr2.length > 0) return arr2;
        
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] arr = new Document[4];

        for(int i = 0; i<arr.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            
            arr[i] = new Document(a,b,c,d);
        }

        Document[] ans = docsWithOddPages(arr);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getId()+" " + ans[i].getTitle() + " " + ans[i].getFolderName() + " " + ans[i].getPages());
            }
        }
        else{
            System.out.println("No such doc available");
        }


        sc.close();
    }
}

class Document
{
    int id; 
    String title; 
    String folderName; 
    int pages;
    
    public Document(int id, String title, String folderName, int pages)
    {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getFolderName()
    {
        return folderName;
    }
    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
}
