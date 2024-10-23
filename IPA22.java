import java.util.Scanner;

public class IPA22 {
    
    static int findTestPassedByEnv(AutonomousCar[] arr, String env){
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getEnv().equalsIgnoreCase(env)){
                sum += arr[i].getPass();
            }
        }
        return sum;
    }

    static AutonomousCar updateCarGrade(AutonomousCar[] arr, String brand){

        for(int i =0; i<arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                int grade = (arr[i].getPass() * 100) / (arr[i].getCon());

                if(grade >= 80){
                    arr[i].setGrade("A1");
                }
                else arr[i].setGrade("B2");

                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] arr = new AutonomousCar[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new AutonomousCar(a,b,c,d,e);
        }
        String env = sc.nextLine();
        String brand = sc.nextLine();

        int c = findTestPassedByEnv(arr, env);
        if(c > 0){
            System.out.println(c);
        }
        else System.out.println("There are no tests passed in this particular environment");

        AutonomousCar ans = updateCarGrade(arr, brand);

        if(ans == null) System.out.println("No Car is available with the specified brand");

        else{
            System.out.println(ans.getBrand() + " : " + " " + ans.getGrade());
        }


        sc.close();
    }
}

class AutonomousCar
{
    private int id;
    private String brand;
    private int con;
    private int pass;
    private String env;
    private String grade;

    public AutonomousCar(int id, String brand, int con, int pass, String env)
    {
        this.id = id;
        this.brand = brand;
        this.con = con;
        this.pass = pass;
        this.env = env;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }
    
}
