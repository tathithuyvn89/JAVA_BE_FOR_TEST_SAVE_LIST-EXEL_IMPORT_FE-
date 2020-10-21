package com.veho.practice.controller;

import com.veho.practice.dto.StaffDTO;
import com.veho.practice.model.Department;
import com.veho.practice.model.Staff;
import com.veho.practice.service.departmentServiceImpl.DepartmentService;
import com.veho.practice.service.staffServiceImpl.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/staffs")
@CrossOrigin("*")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("")
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {

       Staff newStaff = new Staff();
       newStaff.setDepartment(staff.getDepartment());
       newStaff.setGender(staff.getGender());
       newStaff.setName(staff.getName());
       staffService.save(newStaff);
        return  new ResponseEntity<>(newStaff, HttpStatus.OK);
    }
//    @PostMapping("/createlist")
//    public ResponseEntity<List<Staff>> saveListStaff(@RequestBody List<StaffDTO> listStaffJson) {
//        List <Staff> list = new ArrayList<>();
//        for (int i=0; i<listStaffJson.size();i++) {
//          String departmentName = listStaffJson.get(i).getDepartment();
//          if (departmentService.isExistDepartmentByName(departmentName)) {
//             Staff staff = new Staff();
//             staff.setName(listStaffJson.get(i).getName());
//             staff.setStaffNumber(listStaffJson.get(i).getStaffNumber());
//             staff.setGender(listStaffJson.get(i).getGender());
//             Department department = departmentService.findByName(departmentName);
//             staff.setDepartment(department);
//             list.add(staff);
//          } else  {
//              Staff staff = new Staff();
//              staff.setName(listStaffJson.get(i).getName());
//              staff.setStaffNumber(listStaffJson.get(i).getStaffNumber());
//              staff.setGender(listStaffJson.get(i).getGender());
//              staff.setDepartment(departmentService.save(new Department(departmentName)));
//              list.add(staff);
//          }
//        }
//      List<Staff> list = staffService.saveStaffList(listStaffJson);
//        return  new ResponseEntity<>(list, HttpStatus.OK);
//    }
@PostMapping("/createlist")
public ResponseEntity<List<Staff>> saveListStaff(@RequestBody List<Staff> listStaffJson) {

    List<Staff> list = staffService.saveStaffList(listStaffJson);
    return  new ResponseEntity<>(list, HttpStatus.OK);
}

}
