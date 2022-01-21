package com.dague.repo;

import com.dague.beans.Comment;
import com.dague.beans.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository {

    List<Comment> findByPost(Post post, Sort sort);
}
