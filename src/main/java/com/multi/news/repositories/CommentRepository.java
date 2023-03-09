package com.multi.news.repositories;

import com.multi.news.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment,Long> {
    @Query(value = "SELECT p FROM Posts p ORDER BY p.id DESC",nativeQuery = true)
    List<Comment> findAllDesc();

    Comment findByAuthor(String author);
}
