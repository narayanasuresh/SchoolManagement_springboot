package com.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Classes;


@Repository
public interface ClassRepo extends CrudRepository<Classes, Long> {

}
