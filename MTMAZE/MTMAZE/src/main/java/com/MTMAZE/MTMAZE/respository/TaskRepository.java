package com.MTMAZE.MTMAZE.respository;
import com.MTMAZE.MTMAZE.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends  JpaRepository<Task ,Integer> {
}
