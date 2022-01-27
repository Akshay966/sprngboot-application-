package com.Atomcodes.Student.system.repository;

import com.Atomcodes.Student.system.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepository extends JpaRepository<student,Integer> {
}
