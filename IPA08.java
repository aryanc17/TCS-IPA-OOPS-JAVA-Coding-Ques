import java.util.Scanner;

public class IPA08 {
    
    static int findNumClearedByLoc(Institution[] arr, String location){
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getLocation().equalsIgnoreCase(location)){
                sum += arr[i].getCleared();
            }
        }
        return sum;
    }

    static Institution updateInstitutionGrade(Institution[] arr, String institutionName){
        for(int i =0; i<arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(institutionName)){
                int rating = (arr[i].getPlaced() * 100) / (arr[i].getCleared());

                if(rating >= 80 ){
                    arr[i].setGrade("A");
                }
                else arr[i].setGrade("B");
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution[] arr = new Institution[4];

        for(int i =0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();

            arr[i] = new Institution(a, b, c, d, e, f);
        }
        String location = sc.nextLine();
        String name = sc.nextLine();

        Institution obj = updateInstitutionGrade(arr, name);
        int sum = findNumClearedByLoc(arr, location);
        if(sum > 0){
            System.out.println(sum);
        }
        else{
            System.out.println("There are no cleared students in this particular location");
        }

        if(obj == null){
            System.out.println("No institution is available with the specific name");
        }
        else{
            System.out.println(obj.getName() + "::"+ obj.getGrade());
        }


        sc.close();
    }
}

class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location, String grade){
        this.institutionId = institutionId;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
        this.grade = grade;
    }

    public int getId(){
        return institutionId;
    }

    public String getName(){
        return institutionName;
    }

    public int getPlaced(){
        return noOfStudentsPlaced;
    }

    public int getCleared(){
        return noOfStudentsCleared;
    }

    public String getLocation(){
        return location;
    }

    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
}
