package upgrad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import upgrad.model.post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class homeController {
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<post> posts = new ArrayList<post>();
        post p1 = new post();
        p1.setTitle("post1 title");
        p1.setBody("post1 body");
        p1.setDate(new Date());

        post p2 = new post();
        p2.setTitle("post2 title");
        p2.setBody("post2 body");
        p2.setDate(new Date());

        post p3 = new post();
        p3.setTitle("post3 title");
        p3.setBody("post3 body");
        p3.setDate(new Date());

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

        model.addAttribute("posts", posts);

        return "index";
    }
}
