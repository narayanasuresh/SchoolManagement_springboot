package com.school.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
	public List<Student> findBySName(String sName);
}
