package com.vincent.Repository;

import com.vincent.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    List<Student> findAll();

    Student findById(int id);

    void deleteById(Integer id);
}
