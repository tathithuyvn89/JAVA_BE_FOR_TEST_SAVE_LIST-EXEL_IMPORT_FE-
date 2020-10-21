package com.veho.practice.controller;

import com.veho.practice.model.Department;
import com.veho.practice.service.departmentServiceImpl.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/departments")
@CrossOrigin("*")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping()
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department departmentDB = departmentService.save(department);
        return  new ResponseEntity<>(departmentDB, HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<Department>> showDepartmentList(){
        List<Department> departmentList = departmentService.findAll();
        return  new ResponseEntity<>(departmentList,HttpStatus.OK);
    }
}
