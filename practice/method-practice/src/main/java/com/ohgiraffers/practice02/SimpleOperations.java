package com.ohgiraffers.practice02;

public class SimpleOperations {



    public void printMessage() {
        System.out.println("메소드 호출 확인");
    }
    public int sumNumbers(int start, int end){
        int sum = 0;
        for (int i = start;i<=end;i++){
            sum += i;
        }
        return sum;
    }
    public boolean isEvenNumber(int num){
        return num%2==0 ;
    }
    public int countCharacter(String input,char ch){
        int count = 0;
        for (int i = 0; i<input.length();i++){
            if (input.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public String reverseString(String input){

        StringBuilder rv = new StringBuilder(input);
        return rv.reverse().toString();    }
}
