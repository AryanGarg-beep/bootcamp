class LibraryUser {
  String name;
  int userID;

  LibraryUser(String name, int userID) {
    this.name = name;
    this.userID = userID;
  }

  public void displayInfo() {
    System.out.println("User: " + name + ", ID: " + userID);
  }

  public void logEntry() {
    System.out.println(name + " has entered the library.");
  }
}

class Student extends LibraryUser {
  Student(String name, int userID) {
    super(name, userID);
  }

  public void borrowBooks() {
    System.out.println(name + " borrowed a book.");
  }

  public void accessComputers() {
    System.out.println(name + " accessed a computer.");
  }
}

class Faculty extends LibraryUser {
  Faculty(String name, int userID) {
    super(name, userID);
  }

  public void reserveBooks() {
    System.out.println(name + " reserved a book.");
  }

  public void accessResearchDatabase() {
    System.out.println(name + " accessed the research database.");
  }
}

class Guest extends LibraryUser {
  Guest(String name, int userID) {
    super(name, userID);
  }

  public void browseBooks() {
    System.out.println(name + " browsed the books.");
  }
}

public class UniversityLibrarySystem {
  public static void main(String[] args) {
    LibraryUser[] users = {
        new Student("Alice", 101),
        new Faculty("Dr. Smith", 201),
        new Guest("Bob", 301)
    };

    for (LibraryUser u : users) {
      u.displayInfo();
      u.logEntry();
      System.out.println();
    }
  }
}
