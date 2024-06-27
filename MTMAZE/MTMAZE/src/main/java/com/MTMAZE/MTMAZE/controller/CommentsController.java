package com.MTMAZE.MTMAZE.controller;

import com.MTMAZE.MTMAZE.entity.Comments;
import com.MTMAZE.MTMAZE.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/RequestComments")
public class CommentsController {
        @Autowired
        private CommentsService commentsService;

        @PostMapping("/addComments")
        public Comments addComments(@RequestBody Comments comments) {
            return commentsService.saveComments(comments);
        }



        @GetMapping("/comments")
        public List<Comments> getAllComments() {
            return commentsService.getAllComments();
        }

        @GetMapping("/Comments/{id}")
        public Comments findCommentsById(@PathVariable int id) {
            return commentsService.getCommentsById(id);
        }

        @PutMapping("/updateComments")
        public Comments updateComments(@RequestBody Comments comments) {
            return commentsService.updateComments(comments);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteComments(@PathVariable int id) {
            return commentsService.deleteComments(id);
        }
    }