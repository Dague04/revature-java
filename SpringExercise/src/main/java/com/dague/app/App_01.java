package com.dague.app;

import com.dague.beans.Comment;
import com.dague.beans.Post;
import com.dague.repo.CommentRepository;
import com.dague.repo.PostRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {

        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");

        Post post1 = new Post("My new post", "dague");

        PostRepository postRepository = ctxt.getBean(PostRepository.class);
        postRepository.save(post1);

        CommentRepository commentRepository = ctxt.getBean(CommentRepository.class);
        commentRepository.save(new Comment("I am learning too", post1));
        commentRepository.save(new Comment("I am watching a TED talk", post1));
        commentRepository.save(new Comment("I am resting", post1));

    }
}
