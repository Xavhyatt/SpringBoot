package com.qa.springBootExc2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springBootExc2.model.mySpringBootDataModel;

@Repository
public interface personRepository extends JpaRepository<mySpringBootDataModel, Long> {

}
