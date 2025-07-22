package com.ohgiraffers.practice01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 1.
        * 프로그램 개요
        * 바리스타가 커피머신을 사용하는 프로그램
        *
        * 시스템 요구 사항
        * 1. 바리스타는 머신 켜기, 샷 버튼 누르기, 멈춤 버튼 누르기, 머신 끄기를 할 수 있다.
        * 2. 커피머신은 머신 켜기, 샷 내리기, 멈추기, 머신 끄기를 할 수 있다.
        * 3. 커피머신은 처음에 멈춰 있는 상태이다.
        * 4. 바리스타는 먼저 커피머신을 켠다. 이미 켜져있는 경우 다시 켤 수 없다.
        * 5. 바리스타가 샷을 내리면 머신이 켜져 있는 경우 샷을 1개 내려준다.
        * 6. 머신이 샷을 내리는 중인 경우 멈춤 버튼을 누르면 멈춘다.
        * 7. 멈춤 버튼을 누를 때 머신이 샷을 내리는 중이 아니라면 이미 멈춰있는 중이라고 안내한다.
        * 8. 바리스타가 머신을 끄면 더 이상 샷은 내려오지 않는다.
        * 9. 머신이 샷을 내리는 중이라면 멈출 수 없다.
        * */

        /* 2.
        * 프로그램 설계
        * 1. 필요한 객체 도출
        * - 플레이어(사용자), 바리스타, 커피머신
        *
        * 2. 객체 간 상호작용
        * - 바리스타가 수신할 수 있는 메세지(해야 하는 일)
        * 1. 머신을 켜라
        * 2. 샷 버튼을 눌러라
        * 3. 멈춤 버튼을 눌러라
        * 4. 머신을 꺼라
        *
        *
        *       승객  놀이기구
        *  1. 탑승하기/출발하기
        *  2. 손잡이올리기/올라가기
        *  3. 손잡이 내리기/내려가기
        *  4. 내리기/중단하기
        *
        *
        * - 커피머신이 수신할 수 있는 메세지(해야 하는 일)
        * 1. 머신을 켜라
        * 2. 샷을 내려라
        * 3. 멈춰라
        * 4. 머신을 꺼라
        * */

        Barista barista = new Barista();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("====== 커피만들기 프로그램 =====");
            System.out.println("1. 커피머신 켜기");
            System.out.println("2. 샷 버튼 누르기");
            System.out.println("3. 샷 멈추기");
            System.out.println("4. 커피머신 끄기");
            System.out.println("8. 프로그램 종료");
            System.out.print("동작 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : barista.turnOn();break;
                case 2 : barista.pressShot();break;
                case 3 : barista.stopShot();break;
                case 4 : barista.turnOff();break;
                case 8 :
                    System.out.println("커피 만들기를 종료합니다.");break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");break;
            }
            if (no==8){
                break;
            }
        }
    }
}
