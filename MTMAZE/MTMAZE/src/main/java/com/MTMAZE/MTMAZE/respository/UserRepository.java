package com.MTMAZE.MTMAZE.respository;
import com.MTMAZE.MTMAZE.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
