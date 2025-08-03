package com.ohgiraffers.section01.remix;

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
                case 1:
                    employeeController.selectAllEmployee();
                    break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        } while (true);
    }
}
