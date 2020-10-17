package com.veho.practice.repository;

import com.veho.practice.model.Deparment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Deparment, Long> {
}
