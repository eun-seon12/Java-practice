package com.ohgiraffers.section01.remix;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int registEmployee(EmployeeDTO employee);

    int updateEmployee(EmployeeDTO employee);
}
