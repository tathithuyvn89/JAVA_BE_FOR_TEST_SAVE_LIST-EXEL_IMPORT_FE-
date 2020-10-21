package com.veho.practice.service.departmentServiceImpl;

import com.veho.practice.model.Department;
import com.veho.practice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department remove(Long id) {
        return null;
    }

    @Override
    public Department save(Department model) {
        return departmentRepository.save(model);
    }

    @Override
    public Department findByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public boolean isExistDepartmentByName(String name) {
        return  departmentRepository.existsDepartmentByName(name);
    }
}
