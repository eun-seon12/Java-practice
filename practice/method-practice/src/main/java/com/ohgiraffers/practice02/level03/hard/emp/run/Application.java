package com.ohgiraffers.practice02.level03.hard.emp.run;

import com.ohgiraffers.practice02.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDTO employeeDTO  = new EmployeeDTO();

        System.out.print("번호를 입력하세요 : ");
        int number = sc.nextInt();
        employeeDTO.setNumber(number);
        sc.nextLine();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        employeeDTO.setName(name);

        System.out.print("부서를 입력하세요 : ");
        String dept = sc.nextLine();
        employeeDTO.setDept(dept);

        System.out.print("직급을 입력하세요 : ");
        String job = sc.nextLine();
        employeeDTO.setJob(job);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        employeeDTO.setAge(age);
//        sc.nextLine();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        employeeDTO.setGender(gender);

        System.out.print("월급을 입력하세요 : ");
        int salary = sc.nextInt();
        employeeDTO.setSalary(salary);
//        sc.nextLine();

        System.out.print("보너스를 입력하세요 : ");
        double bonusPoint = sc.nextDouble();
        employeeDTO.setBonusPoint(bonusPoint);
        sc.nextLine();

        System.out.print("전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        employeeDTO.setPhone(phone);

        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        employeeDTO.setAddress(address);


        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());
    }
}
