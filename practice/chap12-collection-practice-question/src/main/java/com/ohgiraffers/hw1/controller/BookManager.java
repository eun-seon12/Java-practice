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

        System.out.println(booklist.get(index));
    }

    public void displayAll() {

        for(int i = 0; i<booklist.size(); i++){
            System.out.println(booklist.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){

        Comparator<?extends BookDTO> comparator;
        if (select == 1){
            System.out.println("오름차순으로 정렬");
            booklist.sort(new AscCategory());
        } else if(select == 2){
            System.out.println("내림차순으로 정렬");
            booklist.sort(new DescCategory());
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
