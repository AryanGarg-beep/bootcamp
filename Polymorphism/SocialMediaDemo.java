// File: SocialMediaDemo.java 
class SocialMediaPost {
  protected String content;
  protected String author;

  SocialMediaPost(String content, String author) {
    this.content = content;
    this.author = author;
  }

  // TODO: Create 'share()' method that prints "Sharing: [content] by [author]"
  public void share() {
    System.out.println("Sharing: " + content + " by " + author);
  }
}

class InstagramPost extends SocialMediaPost {
  private int likes;

  InstagramPost(String content, String author, int likes) {
    super(content, author);
    this.likes = likes;
  }

  // TODO: Override 'share()' to print " Instagram: [content] by @[author] -
  // [likes] likes "
  @Override
  public void share() {
    System.out.println("Instagram: " + content + " by @" + author + " - " + likes + " likes");
  }
}

class TwitterPost extends SocialMediaPost {
  private int retweets;

  public TwitterPost(String content, String author, int retweets) {
    super(content, author);
    this.retweets = retweets;
  }

  // TODO: Override 'share()' to print "Tweet: [content] by @[author] - [retweets]
  // retweets "
  @Override
  public void share() {
    System.out.println("Tweet: " + content + " by @" + author + " - " + retweets + " retweets");
  }
}

public class SocialMediaDemo {
  public static void main(String[] args) {
    SocialMediaPost post1 = new SocialMediaPost("Hello world!", "Alice");
    post1.share();

    InstagramPost instaPost = new InstagramPost("Check out my photo", "Bob", 150);
    instaPost.share();

    TwitterPost tweet = new TwitterPost("Java is awesome!", "Charlie", 75);
    tweet.share();
  }
}
