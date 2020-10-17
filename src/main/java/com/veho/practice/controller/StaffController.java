package com.veho.practice.controller;

import com.veho.practice.model.Staff;
import com.veho.practice.service.staffServiceImpl.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/staffs")
@CrossOrigin("*")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("/create")
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {

       Staff newStaff = new Staff();
       newStaff.setDeparment(staff.getDeparment());
       newStaff.setGender(staff.getGender());
       newStaff.setName(staff.getName());
       staffService.save(newStaff);
        return  new ResponseEntity<>(newStaff, HttpStatus.OK);
    }
    @PostMapping("/createlist")
    public ResponseEntity<List<Staff>> saveListStaff(@RequestBody List<Staff> listStaffJson) {

        List<Staff> list = staffService.saveStaffList(listStaffJson);
        return  new ResponseEntity<>(list, HttpStatus.OK);
    }

}
