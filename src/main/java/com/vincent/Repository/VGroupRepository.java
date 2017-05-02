package com.vincent.Repository;

import com.vincent.Entity.VGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VGroupRepository extends CrudRepository<VGroup, Integer> {

}
