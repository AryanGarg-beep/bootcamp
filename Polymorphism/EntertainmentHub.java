// File: EntertainmentHub.java 
class Entertainment {
  protected String title;

  public Entertainment(String title) {
    this.title = title;
  }

  // TODO: Create 'start()' method that prints "Starting [title]"
  public void start() {
    System.out.println("Starting " + title);
  }

  // TODO: Create 'stop()' method that prints "Stopping [title]"
  public void stop() {
    System.out.println("Stopping " + title);
  }
}

class Movie extends Entertainment {
  private String genre;

  public Movie(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  // TODO: Create 'showSubtitles()' that prints "Showing subtitles for [title]
  // ([genre])"
  public void showSubtitles() {
    System.out.println("Showing subtitles for " + title + " (" + genre + ")");
  }

  // TODO: Create 'adjustQuality()' that prints "Adjusting video quality for
  // [title]"
  public void adjustQuality() {
    System.out.println("Adjusting video quality for " + title);
  }
}

class Game extends Entertainment {
  private String platform;

  public Game(String title, String platform) {
    super(title);
    this.platform = platform;
  }

  // TODO: Create 'saveProgress()' that prints "Saving [title] progress on
  // [platform]"
  public void saveProgress() {
    System.out.println("Saving " + title + " progress on " + platform);
  }

  // TODO: Create 'showLeaderboard()' that prints "[title] leaderboard on
  // [platform]"
  public void showLeaderboard() {
    System.out.println(title + " leaderboard on " + platform);
  }
}

public class EntertainmentHub {
  public static void main(String[] args) {
    // TODO: Entertainment Center Simulation:
    // 1. Create Entertainment reference and assign new Movie("Avengers", "Action")
    Entertainment entertainment = new Movie("Avengers", "Action");

    // 2. Call start() through Entertainment reference
    entertainment.start();

    // 3. Downcast Entertainment reference to Movie: Movie m = (Movie)
    // entertainment;
    Movie m = (Movie) entertainment;

    // 4. Call showSubtitles() and adjustQuality() using Movie reference
    m.showSubtitles();
    m.adjustQuality();

    // 5. Repeat with Game("FIFA 24", "PlayStation")
    entertainment = new Game("FIFA 24", "PlayStation");
    entertainment.start();
    Game g = (Game) entertainment;
    g.saveProgress();
    g.showLeaderboard();

    // 6. Demonstrate what happens if you try wrong downcast (Movie to Game)
    // Movie wrongCast = (Movie) entertainment; // ❌ Runtime error:
    // ClassCastException
  }
}
