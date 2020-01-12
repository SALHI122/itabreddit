package ma.itab.reddit.web;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import ma.itab.reddit.core.Post;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.getOutputStream().println("<html><head></head><body>");
        resp.getOutputStream().println("<h1>welcome</h1>");
        resp.getOutputStream().println("<javascrpitalert>a voir</javascriptalert>");*/
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("jack","it's my first post"));
        Post post2 = new Post("emily","it's nice");
        posts.add(post2);

        req.setAttribute("posts",posts);
        req.getRequestDispatcher("homePage.jsp").forward(req, resp);
    }
}
