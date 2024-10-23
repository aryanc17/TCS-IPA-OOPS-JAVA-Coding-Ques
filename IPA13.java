import java.util.Arrays;
import java.util.Scanner;

public class IPA13 {
    
    static int findCountOfDayscholarStudents(Student[] arr){
        int count = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getDayScholar()){
                if(arr[i].getScore() > 80){
                    count++;
                }
            }
        }
        return count;
    }

    static Student findStudentwithSecondHighestScore(Student[] arr){
        double[] score = new double[0];

        for(int i = 0; i < arr.length; i++){
            if(!arr[i].getDayScholar()){
                score = Arrays.copyOf(score, score.length+1);
                score[score.length - 1] = arr[i].getScore();
            }
        }

        Arrays.sort(score);
        double second = score[score.length-2];
        for(int i =0; i<arr.length; i++){
            if(arr[i].getScore() == second){
                return arr[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean(); 

            arr[i] = new Student(a,b,c,d,e);
        }

        int count = findCountOfDayscholarStudents(arr);
        if(count > 0) System.out.println(count);
        else System.out.println("There are no such dayscholar students");

        Student ans = findStudentwithSecondHighestScore(arr);
        if(ans != null){
            System.out.print(ans.getRollNo());
            System.out.print("#");
            System.out.print(ans.getName());
            System.out.print("#");
            System.out.print(ans.getScore());
        }


        sc.close();
    }
}

class Student
{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;


    public Student(int rollNo, String name, String branch, double score, boolean dayScholar)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }


    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getScore()
    {
        return score;
    }
    public void setScore(double score)
    {
        this.score = score;
    }
    public boolean getDayScholar()
    {
        return dayScholar;
    }
    public void setDayScholar(boolean dayScholar)
    {
        this.dayScholar = dayScholar;
    }

}
