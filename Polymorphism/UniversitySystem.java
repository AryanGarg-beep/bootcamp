// File: UniversitySystem.java 
class Person {
  protected String name;
  protected int age;
  protected String email;

  public Person(String name, int age, String email) {
    this.name = name;
    this.age = age;
    this.email = email;
  }

  // TODO: Create 'introduce()' method that prints "Hi! I'm [name], [age] years
  // old."
  public void introduce() {
    System.out.println("Hi! I'm " + name + ", " + age + " years old.");
  }

  // TODO: Create 'getContactInfo()' that prints "Email: [email]"
  public void getContactInfo() {
    System.out.println("Email: " + email);
  }
}

class Student extends Person {
  private String studentId;
  private String major;

  public Student(String name, int age, String email, String studentId, String major) {
    super(name, age, email);
    this.studentId = studentId;
    this.major = major;
  }

  // TODO: Create 'attendLecture()' method that prints "[name] is attending
  // [major] lecture"
  public void attendLecture() {
    System.out.println(name + " is attending " + major + " lecture");
  }

  // TODO: Create 'submitAssignment()' that prints "Assignment submitted by
  // [studentId]"
  public void submitAssignment() {
    System.out.println("Assignment submitted by " + studentId);
  }
}

class Professor extends Person {
  private String department;

  public Professor(String name, int age, String email, String department) {
    super(name, age, email);
    this.department = department;
  }

  // TODO: Create 'conductClass()' that prints "Prof. [name] is teaching
  // [department]"
  public void conductClass() {
    System.out.println("Prof. " + name + " is teaching " + department);
  }
}

public class UniversitySystem {
  public static void main(String[] args) {
    // TODO: University Registration Demo:
    // 1. Create Student("Alice", 20, "alice@uni.edu", "CS2021", "Computer Science")
    Student alice = new Student("Alice", 20, "alice@uni.edu", "CS2021", "Computer Science");

    // 2. Upcast Student to Person reference: Person p = new Student(...)
    Person p = alice;

    // 3. Call introduce() and getContactInfo() using Person reference
    p.introduce();
    p.getContactInfo();

    // 4. Try calling attendLecture() with Person reference - observe compile error
    // p.attendLecture(); // ❌ Compile error: method not found in Person

    // 5. Access the 'name' field through Person reference
    System.out.println("Accessing name through Person reference: " + p.name);

    // 6. Explain why upcasting is safe but limits access to subclass-specific
    // methods
    // Upcasting is safe because Student IS-A Person.
    // But the reference type determines which methods are accessible at compile
    // time.
    // Subclass-specific methods (attendLecture, submitAssignment) are not
    // accessible through a Person reference.
  }
}
