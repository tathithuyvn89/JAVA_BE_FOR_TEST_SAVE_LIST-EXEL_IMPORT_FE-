package com.veho.practice.repository;

import com.veho.practice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
    boolean existsDepartmentByName(String id);
}
