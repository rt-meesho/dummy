package com.codeBuffer.codeBufferSpring.repository;

import com.codeBuffer.codeBufferSpring.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositoryo extends JpaRepository<Department,Long> {
public Department findByDepartmentName(String departmentName);

}
