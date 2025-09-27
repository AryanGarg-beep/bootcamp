class Book {
  String title;
  String author;
  String isbn;
  boolean isAvailable;

  Book() {
    this.title = "";
    this.author = "";
    this.isbn = "";
    this.isAvailable = true;
  }

  Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isbn = "";
    this.isAvailable = true;
  }

  Book(String title, String author, String isbn, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = isAvailable;
  }

  void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
      System.out.println(title + " has been borrowed.");
    } else {
      System.out.println(title + " is not available.");
    }
  }

  void returnBook() {
    if (!isAvailable) {
      isAvailable = true;
      System.out.println(title + " has been returned.");
    } else {
      System.out.println(title + " was not borrowed.");
    }
  }

  void displayBookInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    System.out.println("Available: " + isAvailable);
    System.out.println("-------------------------");
  }
}

public class Library {
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("1984", "George Orwell");
    Book b3 = new Book("Brave New World", "Aldous Huxley", "1234567890", true);

    b1.displayBookInfo();
    b2.displayBookInfo();
    b3.displayBookInfo();

    b2.borrowBook();
    b2.displayBookInfo();

    b2.returnBook();
    b2.displayBookInfo();
  }
}
