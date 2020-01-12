package ma.itab.reddit.core;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedditService<mostPopularUsername> {
    private List<Post> posts = new ArrayList<Post>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public List<Post> searchPosts(String searchText) {
        List<Post> result = new ArrayList<Post>();
        for (Post post : posts) {
            if (post.getText().toLowerCase().contains(searchText.toLowerCase())) {
                result.add(post);
            }
        }

        return result;
    }

    public String getPopularUsers(){
        Map<String, Integer> popularUsers = new HashMap<String, Integer>();
        for (Post post : posts) {
            String username = post.getUsername();
            if(popularUsers.containsKey(username)) {
                popularUsers.put(username, post.getLikes() + popularUsers.get(username));
            }else {
                popularUsers.put(username, post.getLikes());
            }
        }

        int maxLikes = 0;
        String mostPopularUsername = "";
        for (Map.Entry<String, Integer> entry : popularUsers.entrySet()) {
            if(entry.getValue()>maxLikes){
                mostPopularUsername = entry.getKey();
            }
        }
        return mostPopularUsername;
    }
}




