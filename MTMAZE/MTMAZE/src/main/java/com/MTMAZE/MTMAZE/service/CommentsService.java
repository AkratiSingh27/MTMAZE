package com.MTMAZE.MTMAZE.service;

import com.MTMAZE.MTMAZE.entity.Comments;
import com.MTMAZE.MTMAZE.respository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentsService {
    @Autowired
        private CommentsRepository commentsRepository;

        public Comments saveComments(Comments comments) {
            return commentsRepository.save(comments);// Use instance instead of class name
        }

        public List<Comments> getAllComments() {
            return commentsRepository.findAll();
        }

        public Comments getCommentsById(int id) {
            return commentsRepository.findById(id).orElse(null); // Use instance instead of class name
        }
        public String deleteComments(int id) {
            commentsRepository.deleteById(id); // Use instance instead of class name
            return "Comments Removed!! " + id;
        }

        public Comments updateComments(Comments comments) {
            Comments existingComments = commentsRepository.findById(comments.getId()).orElse(null); // Use instance instead of class name
            if (existingComments != null) {
                existingComments.setTask_id(comments.getTask_id());
                existingComments.setProject_id(comments.getProject_id());
                existingComments.setEmp_id(comments.getEmp_id());
                existingComments.setComments(comments.getComments());
                existingComments.setTime_taken(comments.getTime_taken());
                existingComments.setCreated_by(comments.getCreated_by());
                existingComments.setUpdated_by(comments.getUpdated_by());
                existingComments.setCreation_date(comments.getCreation_date());
                existingComments.setUpdation_date(comments.getUpdation_date());
                existingComments.setDeleted(comments.isDeleted());
                return commentsRepository.save(existingComments); // Use instance instead of class name
            }
            return null; // Handle the case where the project is not found
        }
    }
