package com.MTMAZE.MTMAZE.respository;

import com.MTMAZE.MTMAZE.entity.Address;
import com.MTMAZE.MTMAZE.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
