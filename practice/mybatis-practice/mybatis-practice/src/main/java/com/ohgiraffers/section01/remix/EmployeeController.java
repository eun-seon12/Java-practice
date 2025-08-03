package com.ohgiraffers.section01.remix;

import java.util.List;

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
}
