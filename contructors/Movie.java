import java.util.Scanner;

import javax.swing.InternalFrameFocusTraversalPolicy;

class MovieTicket {
  String movieName;
  String theatreName;
  int seatNumber;
  double price;

  MovieTicket() {
    this.movieName = "unknown";
    this.theatreName = "unknown";
    this.seatNumber = 0;
    this.price = 0.0;
  }

  MovieTicket(String movieName) {
    this.movieName = movieName;
    this.theatreName = "Not assigned";
    this.seatNumber = seatNumber;
    this.price = 200.0;
  }

  MovieTicket(String movieName, int seatNumber) {
    this.movieName = movieName;
    this.theatreName = "PVR";
    this.seatNumber = seatNumber;
    this.price = 200.0;
  }

  MovieTicket(String movieName, String theatreName, int seatNumber, double price) {
    this.movieName = movieName;
    this.theatreName = theatreName;
    this.seatNumber = seatNumber;
    this.price = price;
  }

  void printTicket() {
    System.out.println("Movie Ticket Details:");
    System.out.println("Movie: " + movieName);
    System.out.println("Theatre: " + theatreName);
    System.out.println("Seat Number: " + seatNumber);
    System.out.println("Price: " + price);
    System.out.println("------------------------");
  }
}

public class Movie {
  public static void main(String[] args) {
    MovieTicket t1 = new MovieTicket();
    MovieTicket t2 = new MovieTicket("Intersetller");
    MovieTicket t3 = new MovieTicket("Intersteller", 20);
    MovieTicket t4 = new MovieTicket("F1", "IMAX", 20, 100000);

    t1.printTicket();
    t2.printTicket();
    t3.printTicket();
    t4.printTicket();
  }
}
