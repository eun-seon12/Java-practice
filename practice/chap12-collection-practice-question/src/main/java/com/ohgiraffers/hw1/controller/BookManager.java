package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {

    private ArrayList<BookDTO> booklist;

    public BookManager(){

        booklist = new ArrayList<>();
    }

    public void addBook(BookDTO book){

        booklist.add(book);
    }

    public void deleteBook(int index){

        booklist.remove(index);
    }

    public int searchBook(String title){
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        int num = 0;
        for(int i =0; i<this.booklist.size(); i++){
            if (booklist.get(i).getTitle().equals(title)){
                return i;
            } else{
                num=-1;
            }
        } return num;
    }

    public void printBook(int index){
        // index에 해당하는 객체 출력
        System.out.println(booklist.get(index));
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        for(int i = 0; i<booklist.size(); i++){
            System.out.println(booklist.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        // 전달받은 매개변수의 값에 따라 정렬(1.오름 2.내림)
        //for문을 이용하여 ArrayList<BookDTO>에 추가
        // 해당 배열 주소 값 리턴
        Comparator<?extends BookDTO> comparator;
        if (select == 1){
            System.out.println("오름차순으로 정렬");
            booklist.sort(new AscCategory());
        } else if(select == 2){
            System.out.println("내림차순으로 정렬");
            booklist.sort(new DescCategory());
        } else{
            System.out.println("번호를 잘못 입력하였습니다.");
        }

        ArrayList<BookDTO> list = new ArrayList<>();
        for(int i = 0; i<booklist.size(); i++){
            list.add(booklist.get(i));
        }
        return list;
    }


    public void printBookList(ArrayList<BookDTO> br) {

        for (BookDTO book : br){
            System.out.println("book = " + book);
        }
    }

}
