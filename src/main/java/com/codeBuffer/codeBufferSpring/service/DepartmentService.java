package com.codeBuffer.codeBufferSpring.service;

import com.codeBuffer.codeBufferSpring.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department dp);

   public List<Department> getall();

  public Department fetchdepartmentId(Long departmentID);

  public void deleteById(Long departmentID);

  public  Department updateDepartment(Long departmentID, Department department);

   public Department fetchDepartmentByName(String departName);
}
