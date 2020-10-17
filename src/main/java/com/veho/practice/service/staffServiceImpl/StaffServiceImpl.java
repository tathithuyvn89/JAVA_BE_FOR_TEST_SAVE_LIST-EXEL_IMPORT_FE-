package com.veho.practice.service.staffServiceImpl;

import com.veho.practice.model.Staff;
import com.veho.practice.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffRepository staffRepository;
    @Override
    public List<Staff> saveStaffList(List<Staff> list) {
        return staffRepository.saveAll(list);
    }

    @Override
    public Staff findById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Staff remove(Long id) {
        Staff staff = this.findById(id);
        staffRepository.deleteById(id);
        return staff;
    }

    @Override
    public Staff save(Staff model) {
        return staffRepository.save(model);
    }
}
