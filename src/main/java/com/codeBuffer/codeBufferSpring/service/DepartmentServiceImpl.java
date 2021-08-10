package com.codeBuffer.codeBufferSpring.service;

import com.codeBuffer.codeBufferSpring.entity.Department;
import com.codeBuffer.codeBufferSpring.repository.Repositoryo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private Repositoryo dprepo;

    @Override
    public Department saveDepartment(Department dp) {
        return dprepo.save(dp);
    }

    @Override
    public List<Department> getall() {
        return dprepo.findAll();
    }

    @Override
    public Department fetchdepartmentId(Long departmentID) {
        return dprepo.findById(departmentID).get();
    }

    @Override
    public void deleteById(Long departmentID) {
        dprepo.deleteById(departmentID);
    }

    @Override
    public Department updateDepartment(Long departmentID, Department department) {
        Department dpDB=dprepo.findById(departmentID).get();
        if(Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())){
            dpDB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            dpDB.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            dpDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return dprepo.save(dpDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return dprepo.findByDepartmentName(departmentName);
    }


}

