package ma.itab.reddit.core;

public class Post {
   private String  username;
   private String  text;
   private int likes;

    public Post(String username, String text) {
        this.username = username;
        this.text = text;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getText() {
        return text; }
    public void setText(String text) {
        this.text = text;
    }
    public int getLikes() {
        return likes;}
    public void setLikes(int likes) {
        this.likes = likes;}

    public int like(){
        return likes++;
    }
    public int dislike(){
        return likes--;
    }

}

