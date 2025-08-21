package com.ohgiraffers.section01.remix;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;

    private final EmployeeService employeeService;

    public EmployeeController(){
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else{
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        String name = parameter.get("name");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setName(name);
        employee.setPhone(phone);
        employee.setDeptCode(deptCode);
        employee.setJobCode(jobCode);

        if(employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }
}
