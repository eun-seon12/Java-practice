package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> booklist;

    public BookManager(){
    }

    public void addBook(BookDTO book){
        booklist.add(book);
    }

    public void deleteBook(int index){

    }

    //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
    //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴

    public void printBook(int index){
        // index에 해당하는 객체 출력
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        }




}
