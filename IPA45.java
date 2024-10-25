import java.util.*;

public class IPA45 {
    
    static Student findHighestGPAStudent(Student[] arr){
        double max = arr[0].getGpa();
        Student obj = arr[0];

        for(int i =1; i < arr.length; i++){
            if(arr[i].getGpa() > max){
                max = arr[i].getGpa();
                obj = arr[i];
            }
        }
        if(obj != null)return obj;

        return null;
    }

    static Faculty findHighestPaidFaculty(Faculty[] arr){
        Faculty obj = arr[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i].getSal() > obj.getSal()){
                obj = arr[i];
            }
        }
        if(obj != null) return obj;

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[2];
        for(int i =0; i<stu.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            stu[i] = new Student(a,b,c,d,e,f,g,h);
        }

        Faculty[] fac = new Faculty[2];

        for(int i =0; i < fac.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            fac[i] = new Faculty(a,b,c,d,e,f,g,h);
        }

        Student ans1 = findHighestGPAStudent(stu);

        if(ans1 != null){
            System.out.println(ans1.getRoll());
            System.out.println(ans1.getCourse());
            System.out.println(ans1.getGpa());
        }
        else System.out.println("Sorry - No student is available");

        Faculty ans2 = findHighestPaidFaculty(fac);

        if(ans2 != null){
            System.out.println(ans2.getId());
            System.out.println(ans2.getDept());
            System.out.println(ans2.getSal());
        }
        else System.out.println("Sorry - No Faculty is available");



        sc.close();
    }
}

class Person
{
    String fn, ln;
    int age;
    char gen;
    public Person(String fn, String ln, int age, char gen) {
        this.fn = fn;
        this.ln = ln;
        this.age = age;
        this.gen = gen;
    }
    public String getFn() {
        return fn;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    public String getLn() {
        return ln;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGen() {
        return gen;
    }
    public void setGen(char gen) {
        this.gen = gen;
    }   
}

class Student extends Person{
    String rollno, course;
    int sem;
    double gpa;

    Student(String fn, String ln, int age, char gen, String rollno, String course, int sem, double gpa){
        super(fn, ln,age, gen);
        this.rollno = rollno;
        this.course = course;
        this.sem = sem;
        this.gpa = gpa;
    }

    public String getRoll() {
        return rollno;
    }
    public void setRoll(String roll) {
        this.rollno = roll;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class Faculty extends Person{
    String empId, dept, designation;
    double salary;

    Faculty(String fn, String ln, int age, char gen, String empId, String dept, String designation, double salary){
        super(fn, ln, age, gen);
        this.empId = empId;
        this.dept = dept;
        this.designation = designation;
        this.salary = salary;
    }

    public String getId() {
        return empId;
    }
    public void setId(String id) {
        this.empId = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDes() {
        return designation;
    }
    public void setDes(String des) {
        this.designation = des;
    }
    public double getSal() {
        return salary;
    }
    public void setSal(double sal) {
        this.salary = sal;
    }  
}
