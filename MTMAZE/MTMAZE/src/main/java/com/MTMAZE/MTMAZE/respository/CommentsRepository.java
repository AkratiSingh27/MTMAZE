package com.MTMAZE.MTMAZE.respository;
import com.MTMAZE.MTMAZE.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}