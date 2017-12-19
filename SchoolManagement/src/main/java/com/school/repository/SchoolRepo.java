package com.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Schools;


@Repository
public interface SchoolRepo extends CrudRepository<Schools, Long> {

}