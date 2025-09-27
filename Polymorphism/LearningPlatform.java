class Course {
  String title, instructor;

  Course(String t, String i) {
    title = t;
    instructor = i;
  }

  void showProgress() {
    System.out.println(title + " by " + instructor);
  }
}

class VideoCourse extends Course {
  int percent;

  VideoCourse(String t, String i, int p) {
    super(t, i);
    percent = p;
  }

  @Override
  void showProgress() {
    System.out.println(title + " (Video): " + percent + "% completed");
  }
}

class InteractiveCourse extends Course {
  int score;

  InteractiveCourse(String t, String i, int s) {
    super(t, i);
    score = s;
  }

  @Override
  void showProgress() {
    System.out.println(title + " (Interactive): Quiz Score " + score + "%");
  }
}

class ReadingCourse extends Course {
  int pages;

  ReadingCourse(String t, String i, int p) {
    super(t, i);
    pages = p;
  }

  @Override
  void showProgress() {
    System.out.println(title + " (Reading): Pages Read " + pages);
  }
}

class CertificationCourse extends Course {
  boolean certified;

  CertificationCourse(String t, String i, boolean c) {
    super(t, i);
    certified = c;
  }

  @Override
  void showProgress() {
    System.out.println(title + " (Certification): " + (certified ? "Certified" : "Not Certified"));
  }
}

public class LearningPlatform {
  public static void main(String[] args) {
    Course v = new VideoCourse("Java", "Aryan", 70);
    Course i = new InteractiveCourse("DSA", "Aryan", 85);
    Course r = new ReadingCourse("History", "Aryan", 120);
    Course c = new CertificationCourse("AWS", "Aryan", true);

    v.showProgress();
    i.showProgress();
    r.showProgress();
    c.showProgress();
  }
}
