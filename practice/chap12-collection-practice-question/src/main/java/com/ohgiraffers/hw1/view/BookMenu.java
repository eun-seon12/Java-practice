package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu(){
        while (true){
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
            int num1 = sc.nextInt();
            sc.nextLine();

            switch (num1){
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬 방식 선택 (1. 오름차순 2. 내림차순) : ");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    ArrayList<BookDTO> list = bm.sortedBookList(num2);
                    if (num2 == 1 || num2 == 2){
                        bm.printBookList(list);
                    } else{
                        System.out.println("번호를 잘못 입력하였습니다.");
                    }
                    break;
                case 3:
                    System.out.print("삭제할 도서 제목 입력 : ");
                    String titledel = sc.nextLine();
                    int del = bm.searchBook(titledel);
                    if (del != -1){
                        bm.deleteBook(del);
                        System.out.println("성공적으로 삭제");
                    } else{
                        System.out.println("삭제할 글이 존재하지 않음");
                    }
                    break;
                case 4:
                    String searchTitle = inputBookTitle();
                    int index = bm.searchBook(searchTitle);
                    if (index != -1){
                        bm.printBook(index);
                    } else{
                        System.out.println("조회한 도서가 존재하지 않음");
                    }
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.print("1부터 6사이의 숫자를 입력하세요");
                    break;
            }
            System.out.println();
        }

    }

    public BookDTO inputBook(){

        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle(){
        System.out.print("도서 제목 : " );
        String title = sc.nextLine();
        return title;
    }


}
