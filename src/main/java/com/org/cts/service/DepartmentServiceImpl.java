package com.org.cts.service;

import com.org.cts.model.Department;
import com.org.cts.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepo departmentRepo;
    @Override
    public void createStudent(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public void updateStudent(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public List<Department> getAll() {
        List<Department> lis=departmentRepo.findAll();
        return lis;
    }

    @Override
    public String deleteById(Integer id) {
        departmentRepo.deleteById(id);
        return "success";
    }

    @Override
    public Department getById(Integer id) {
        Department dd= departmentRepo.getById(id);
        return dd;
    }
}
