import java.util.*;

class Course{  
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    void setCourseId(int courseId){
        this.courseId = courseId;
    }

    int getCourseId(){
        return courseId;
    }

    void setCourseName(String courseName){
        this.courseName = courseName;
    }

    String getCourseName(){
        return courseName;
    }

    void setCourseAdmin(String courseAdmin){
        this.courseAdmin = courseAdmin;
    }

    String getCourseAdmin(){
        return courseAdmin;
    }

    void setQuiz(int quiz){
        this.quiz = quiz;
    }

    int getQuiz(){
        return quiz;
    }

    void setHandsOn(int handson){
        this.handson = handson;
    }

    int getHandsOn(){
        return handson;
    }
}

class IPA01 {
    
    public static int findAvgOfQuizByAdmin(Course[] arr, String courseAdmin){
        int sum = 0, n = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i].getCourseAdmin().equalsIgnoreCase(courseAdmin)){
                sum += arr[i].getQuiz();
                n++;
            }
        }
        if(n > 0) return (int)(sum/n);

        else return 0;
    }

    static Course[] sortCourseByHandsOn(Course[] arr, int handson){
       Course[] arr2 = new Course[0];

       for(int i =0; i<arr.length; i++){
            if(arr[i].getHandsOn() < handson){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
       }

       // Bubble sort
       for(int i =0; i<arr2.length; i++){
        for(int j =i+1; j<arr2.length; j++){
            if(arr2[i].getHandsOn() > arr2[j].getHandsOn()){
                Course temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
            }
        }
       }
       if(arr2.length > 0) return arr2;
       return null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];

        for(int i =0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Course(a, b, c, d, e);
        }

        String courseAdmin = sc.nextLine();
        int handson = sc.nextInt(); sc.nextLine();

        int avg = findAvgOfQuizByAdmin(arr, courseAdmin);
        if(avg == 0) System.out.println("No course found");
        else System.out.println(avg);

        Course[] ans = sortCourseByHandsOn(arr, handson);

        if(ans != null){
            for(int i =0; i<ans.length; i++){
                System.out.println(ans[i].getCourseName());
            }
        }
        else System.out.println("No Course found with mentioned attribute.");

        sc.close();
    }
    
}