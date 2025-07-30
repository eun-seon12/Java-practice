package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {

        String categorystr = "";

        switch (category) {
            case 1:
                categorystr = "인문";
                break;
            case 2:
                categorystr = "자연과학";
                break;
            case 3:
                categorystr="의료";
                break;
            case 4:
                categorystr="기타";
                break;

        }
        return "BookDTO{" +
                "도서 번호 : " + bNo +
                ", 도서 장르 : " + category +
                ", 도서 제목 : " + title + '\'' +
                ", 도서 저자 : " + author + '\'' +
                '}';
    }
}

