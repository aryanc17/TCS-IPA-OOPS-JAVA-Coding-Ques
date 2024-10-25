import java.util.Arrays;
import java.util.Scanner;

public class IPA46 {
    
    static double calculateAverageGPA(Student[] arr){
        double sum = 0 ;
        int n = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i].getGpa();
            n++;
        }
        if(n == 0) return 0;

        return sum/n;
    }

    static Student[] getStudentsByCourse(Student[] arr, String course){
        Student[] arr2 = new Student[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getC().equals(course)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];
        for(int i =0; i<arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            int f = sc.nextInt();sc.nextLine();
            double g = sc.nextDouble();sc.nextLine();

            arr[i] = new Student(a,b,c,d,e,f,g);
        }
        String course = sc.nextLine();

        double avgGPA = calculateAverageGPA(arr);
        if(avgGPA > 0) System.out.println(avgGPA);
        else System.out.println("Sorry - No students are available");
        
        Student[] ans = getStudentsByCourse(arr, course);

        if(ans.length > 0){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getN());
                System.out.println(ans[i].getR());
                System.out.println(ans[i].getGpa());
            }
        }
        System.out.println("Sorry - No students are available for the given course");
        sc.close();
    }
}

class Student
{
    String n, r;
    int a;
    char g;
    String c;
    int s;
    double gpa;
    public Student(String n, String r, int a, char g, String c, int s, double gpa) {
        this.n = n;
        this.r = r;
        this.a = a;
        this.g = g;
        this.c = c;
        this.s = s;
        this.gpa = gpa;
    }
    public String getN() {
        return n;
    }
    public void setN(String n) {
        this.n = n;
    }
    public String getR() {
        return r;
    }
    public void setR(String r) {
        this.r = r;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public char getG() {
        return g;
    }
    public void setG(char g) {
        this.g = g;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}
