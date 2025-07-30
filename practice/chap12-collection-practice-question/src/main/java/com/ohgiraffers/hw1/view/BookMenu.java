package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu(){
        System.out.println("*** 도서 관리 프로그램 ***");
    }

    public BookDTO inputBook(){

        // 도서 번호 : >> 임의 값 입
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
        return new BookDTO();
    }

//    public String inputBookTitle(){
//        // “도서 제목 : “ >> 입력 받음 >> 리턴
//        return System.out.print("도서 제목 : " );
//    }




}
