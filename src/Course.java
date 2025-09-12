public class Course {
    static int maxCapicity = 50;
    int  totalEnrolledStudents;
    String courseName;
    String[] enrollStudents= new String[maxCapicity];

    Course(String courseName){
        this.totalEnrolledStudents = 0;
        this.courseName= courseName;
        
    }

    public static void  setMaxCapisity(int maxCapicity){

        Course.maxCapicity = maxCapicity;

    }

    public void enrollStudent ( String studentName){
        this.enrollStudents[totalEnrolledStudents] = studentName;
        totalEnrolledStudents++;
    }

    void unEnrollStudent( String studentName){
        int i ;
        for (i = 0; i < this.totalEnrolledStudents; i++) {

           if( enrollStudents[i].matches(studentName)){
            enrollStudents[i] = null;
            totalEnrolledStudents--;
            System.out.println("you successfully unenrolled from course");
            break;
           }else{
            System.out.println("The student provided by you didn't enrolled in course");
           }
        }
       
    }

    void getTotalStudent(){
        System.out.println( totalEnrolledStudents + " Students enrolled in our course and maximum capacity is : " + maxCapicity);
    }

    public static void main(String[] args) {
        
        Course javaBasics = new Course("java basics");
      
     
      javaBasics.enrollStudent("Student 1");
      javaBasics.enrollStudent("Student 2");
       javaBasics.enrollStudent("Student 2");
        javaBasics.enrollStudent("Student 2");
       System.out.println(javaBasics.enrollStudents.length);

       javaBasics.unEnrollStudent("Student 1");

       System.out.println(javaBasics.enrollStudents.length);
       System.out.println(javaBasics.totalEnrolledStudents);

    }
    
}
