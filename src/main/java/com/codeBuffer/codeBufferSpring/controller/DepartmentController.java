package com.codeBuffer.codeBufferSpring.controller;

//import com.codeBuffer.codeBufferSpring.service.ResponseInt;
import com.codeBuffer.codeBufferSpring.entity.Department;
import com.codeBuffer.codeBufferSpring.service.DepartmentService;
//import com.codeBuffer.codeBufferSpring.service.ResponseInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class DepartmentController {

    @Autowired
    private DepartmentService dpservice;

    // @Autowired
     //Responseobj responseobj;

    /*@PostMapping("/dep")
    public Responseobj saveDepartment(@RequestBody Department dp){
        //departmentService
         //User user = userRepository.save(user);
        Long dpi= dp.getDepartmentID();
        return responseint.validResponse(dpi);
    }*/

    @GetMapping("/dep")
    public List<Department> getall(){
        return dpservice.getall();
    }

    @GetMapping("/dep/{id}")
    public Department fetchbydepartmentId(@PathVariable("id") Long departmentID){
        return dpservice.fetchdepartmentId(departmentID);
    }

    @DeleteMapping("/dep/{id}")
    public String deleteById(@PathVariable("id") Long departmentID){
        dpservice.deleteById(departmentID);
        return "Deleted Successfully";
    }
    @PutMapping("/dep/{id}")
    public Department updateDepartment(Long departmentID,
                                       @RequestBody Department department){
        return dpservice.updateDepartment(departmentID,department);
    }
    @GetMapping("dep/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departName){
        return dpservice.fetchDepartmentByName(departName);
    }

}
