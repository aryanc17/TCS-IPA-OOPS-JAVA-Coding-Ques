import java.util.Arrays;
import java.util.Scanner;

public class IPA24 {
    

    static Stu[] findStudentByGradeAndMonth(Stu[] arr, char grade, int month){
        Stu [] student = new Stu[0];

        for(int i =0; i<arr.length; i++){
            int m = Integer.valueOf(arr[i].getDate().substring(4,5));
            if(month > 10) m = Integer.valueOf(arr[i].getDate().substring(3,5)); 
            if((arr[i].getGrade() == grade) && (month == m) ){
                student = Arrays.copyOf(student, student.length+1);
                student[student.length-1] = arr[i];
            }
        }

        for(int i =0; i<student.length; i++){
            for(int j = i+1; j<student.length; j++){
                if(student[i].getRoll() > student[j].getRoll()){
                    Stu temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        if(student.length >0) return student;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stu arr[] = new Stu[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            arr[i] = new Stu(a, b, c, d, e);
        }
        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt(); sc.nextLine();

        Stu[] ans = findStudentByGradeAndMonth(arr, grade, month);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getName());
                System.out.println(ans[i].getSub());
            }
            System.out.println(ans.length);
        }
        else{
            System.out.println("No student found");
        }

        sc.close();
    }
}

class Stu
{
    private int roll;
    private String name;
    private String sub;
    private char grade;
    private String date;

    public Stu(int roll, String name, String sub, char grade, String date)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    public char getGrade(){
        return grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
}
