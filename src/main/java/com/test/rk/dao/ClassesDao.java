package com.test.rk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.rk.entity.Classes;

@Repository
public interface ClassesDao extends JpaRepository<Classes, Integer> {

}
