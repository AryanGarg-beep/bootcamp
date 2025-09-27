class Post {
  String author;
  String content;
  String time;

  Post(String author, String content, String time) {
    this.author = author;
    this.content = content;
    this.time = time;
  }

  public void display() {
    System.out.println(author + ": " + content + " (" + time + ")");
  }
}

class InstagramPost extends Post {
  int likes;
  String hashtags;

  InstagramPost(String author, String content, String time, int likes, String hashtags) {
    super(author, content, time);
    this.likes = likes;
    this.hashtags = hashtags;
  }

  @Override
  public void display() {
    System.out.println("Instagram Post by " + author);
    System.out.println(content);
    System.out.println("Likes: " + likes + " " + hashtags);
    System.out.println("Posted at: " + time);
  }
}

class TwitterPost extends Post {
  int retweets;

  TwitterPost(String author, String content, String time, int retweets) {
    super(author, content, time);
    this.retweets = retweets;
  }

  @Override
  public void display() {
    System.out.println("Tweet by " + author);
    System.out.println(content + " (" + content.length() + " chars)");
    System.out.println("Retweets: " + retweets);
    System.out.println("Posted at: " + time);
  }
}

class LinkedInPost extends Post {
  int connections;

  LinkedInPost(String author, String content, String time, int connections) {
    super(author, content, time);
    this.connections = connections;
  }

  @Override
  public void display() {
    System.out.println("LinkedIn Post by " + author);
    System.out.println("[Professional] " + content);
    System.out.println("Connections: " + connections);
    System.out.println("Posted at: " + time);
  }
}

public class SocialMediaFeed {
  public static void main(String[] args) {
    Post p1 = new InstagramPost("Aryan", "Enjoying the beach!", "10:00 AM", 120, "#sunny #vacation");
    Post p2 = new TwitterPost("Aryan", "Learning Java!", "11:00 AM", 15);
    Post p3 = new LinkedInPost("Aryan", "Excited to share my new project.", "12:00 PM", 500);

    p1.display();
    System.out.println();
    p2.display();
    System.out.println();
    p3.display();
  }
}
