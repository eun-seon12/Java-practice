package com.ohgiraffers.section01.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("직원 관리");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 코드로 직원 조회");
            System.out.println("3. 신규 직원 추가");
            System.out.println("4. 직원 수정");
            System.out.println("5. 직원 삭제");
            System.out.print("직원 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: employeeController.selectAllEmployee(); break;
                case 2: employeeController.selectEmployeeById(inputEmployeeId()); break;
                case 3: employeeController.registEmployee(inputEmployee()); break;
                case 4: employeeController.modifyEmployee(inputModifyEmployee());break;
                case 5: employeeController.deleteEmployee(inputEmployeeId()); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        } while (true);
    }
    private static Map<String, String> inputEmployeeId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사번을 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("전화 번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("부서 코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("직급 코드를 입력하세요 : ");
        String jobCode = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);

        return parameter;
    }

    private static Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 사번을 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 부서 코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("수정할 직급 코드를 입력하세요 : ");
        String jobCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);

        return parameter;
    }

}
