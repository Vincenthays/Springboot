package com.vincent.Repository;

import com.vincent.Entity.RouxGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouxGroupRepository extends CrudRepository<RouxGroup, Integer> {

}
