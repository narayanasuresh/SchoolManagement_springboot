package com.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Teacher;


@Repository
public interface TeacherRepo extends CrudRepository<Teacher, Long> {

}