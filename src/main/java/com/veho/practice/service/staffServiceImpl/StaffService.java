package com.veho.practice.service.staffServiceImpl;

import com.veho.practice.model.Staff;
import com.veho.practice.service.CrudGenericService;

import java.util.List;

public interface StaffService extends CrudGenericService<Staff> {
List<Staff> saveStaffList(List<Staff> list);

}
