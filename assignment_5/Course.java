import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[100]; 
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("Cannot add more students. Course is full.");
        }
    }

  
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
            
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null; 
                numberOfStudents--;
                return; 
            }
        }
        System.out.println(student + " is not enrolled in this course.");
    }


    public String[] getStudents() {
        String[] enrolledStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, enrolledStudents, 0, numberOfStudents);
        return enrolledStudents;
    }

   
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
       
        Course javaCourse = new Course("Java Programming");

 
        javaCourse.addStudent("Harshul");
        javaCourse.addStudent("Dev");
        javaCourse.addStudent("Om");

      
        javaCourse.dropStudent("Bob");

       
        System.out.println("Course Name: " + javaCourse.getCourseName());
        System.out.println("Number of Students: " + javaCourse.getNumberOfStudents());
        System.out.println("Enrolled Students: " + Arrays.toString(javaCourse.getStudents()));
    }
}
