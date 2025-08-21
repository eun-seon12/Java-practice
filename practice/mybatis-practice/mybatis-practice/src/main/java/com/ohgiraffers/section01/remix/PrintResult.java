package com.ohgiraffers.section01.remix;

import java.util.List;

public class PrintResult {

    public void printEmployeeList(List<EmployeeDTO> employeeList){

        for(EmployeeDTO employee :employeeList){
            System.out.println(employee);
        }
    }
    public void printEmployee(EmployeeDTO employee){
        System.out.println(employee);
    }
    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode){
            case "selectList":errorMessage = "직원 목록 조회를 실패하였습니다.";break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "신규 메뉴 등록을 성공하였습니다.";
                break;
        }
    }
}
