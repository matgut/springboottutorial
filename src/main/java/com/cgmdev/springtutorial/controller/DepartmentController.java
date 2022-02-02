package com.cgmdev.springtutorial.controller;


import com.cgmdev.springtutorial.entity.Department;
import com.cgmdev.springtutorial.service.DepartmentService;
import com.cgmdev.springtutorial.service.implementation.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDept(department);

    }

    @GetMapping
    public List<Department> getDepartments(){
        return departmentService.getDeptList();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDeptById(departmentId);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDeptById(departmentId);
        return "Department deleted successgulle!!";
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDept(departmentId, department);
    }
}
