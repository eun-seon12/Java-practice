package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> booklist;

    public BookManager(){
        BookManager booklist = new BookManager();
    }

    public void addBook(BookDTO book){
        //bookList에 도서 추가
        booklist.add(book);
    }

    public void deleteBook(int index){
        //전달받은 index로 삭제

        booklist.remove(2);
    }

//    public int searchBook(String title){
    //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
    //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
//        if (title==){
//            return ;
//        } else {
//            return -1;
//        }
//    }

    public void printBook(int index){
        // index에 해당하는 객체 출력
        System.out.println(index);
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        System.out.println(booklist);
    }

//    public ArrayList<BookDTO> sortedBookList(int select){
//        // 전달받은 매개변수의 값에 따라 정렬(1.오름 2.내림)
//        //for문을 이용하여 ArrayList<BookDTO>에 추가
//        // 해당 배열 주소 값 리턴
//    }

//    public void printBookList(ArrayList<BookDTO>) {
//        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
//        for (BookDTO book : booklist){
//            System.out.println("book = " + book);
//        }
//    }


}
