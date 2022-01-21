package com.dague.repo;


import com.dague.beans.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Post findByUsername(String username);
}
