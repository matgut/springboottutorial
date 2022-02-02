package com.cgmdev.springtutorial.service;

import com.cgmdev.springtutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDept(Department department);

    List<Department> getDeptList();

    Department getDeptById(Long departmentId);

    void deleteDeptById(Long departmentId);

    Department updateDept(Long departmentId, Department department);
}
