public class Student {
    // TODO: Define private instance variables:
// - studentId (String)
// - name (String)
// - grade (double)
// - course (String)
    private String studentId;
    private String name;
    private double grade;
    private String course;
// TODO: Create a default constructor (no parameters)
    public Student(){
        studentId = "Unknown";
        name = "Unknown";
        grade = 0.0;
        course = "Undeclared";
    }
// TODO: Create a parameterized constructor that accepts all attributes // TODO: Create getter and setter methods for all attributes
    public Student(String StudentID, String name, double grade, String course){
        this.studentId = StudentID;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
    // TODO: Create a method calculateLetterGrade() that returns: // A (90-100), B (80-89), C (70-79), D (60-69), F (below 60)
    public String calculateLetterGrade(){
        if(grade >= 90 && grade <= 100){
            return "A";
        } else if(grade >= 80 && grade < 90){
            return "B";
        } else if(grade >= 70 && grade < 80){
            return "C";
        } else if(grade >= 60 && grade < 70){
            return "D";
        } else {
            return "F";
        }
    }
    // TODO: Create a method displayStudent() that shows all information
    public void displayStudent(){
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(grade);
        System.out.println(course);
        System.out.println(calculateLetterGrade());
    }
    public static void main(String[] args) {
// TODO: Create one student using default constructor, then set values
// TODO: Create another student using parameterized constructor // TODO: Demonstrate all getter/setter methods
// TODO: Show both students' information and letter grades }
        Student student1 = new Student();
        student1.studentId = "414";
        student1.name = "Aryan";
        student1.grade = 99.5;
        student1.course = "Maths";

        Student student2 = new Student("414", "Aryan", 100, "OS");

        student1.displayStudent();
        System.out.println();
        student2.displayStudent();
    }
}

