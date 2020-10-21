package com.veho.practice.service.departmentServiceImpl;

import com.veho.practice.model.Department;
import com.veho.practice.service.CrudGenericService;

public interface DepartmentService  extends CrudGenericService<Department> {
    Department findByName(String name);
    boolean isExistDepartmentByName(String name);
}
