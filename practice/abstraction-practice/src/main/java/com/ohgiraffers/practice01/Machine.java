package com.ohgiraffers.practice01;

public class Machine {

    private boolean isOn;
    private int shot;

    public void turnOn(){
        if (isOn){
            System.out.println("이미 머신이 켜져 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("머신을 켰습니다. 샷 내리기가 가능합니다!");
        }
    }

    public void make(){
        if (isOn){
            System.out.println("샷을 내립니다.");
            this.shot+=1;
            System.out.println("현재 "+this.shot+"개의 샷을 내렸습니다.");
        } else {
            System.out.println("머신이 켜져있지 않습니다. 머신을 먼저 켜주세요.");
        }
    }

    public void stop() {
        if (isOn){
            if (this.shot>0){
                this.shot=0;
                System.out.println("멈춤 버튼을 누르셨습니다. 샷 내리기를 중단합니다.");
            } else {
                System.out.println("이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("머신이 켜져있지 않습니다. 머신을 먼저 켜주세요.");
        }
    }

    public void turnoff() {
        if (isOn){
            if (shot>0){
                System.out.println("샷을 내리는 도중에는 머신을 끌 수 없습니다. 샷 내리기를 중단해주세요.");
            } else {
                this.isOn=false;
                System.out.println("머신을 끕니다. 다시 샷을 내리시려면 머신을 켜주세요.");
            }
        } else {
            System.out.println("이미 머신이 꺼져 있는 상태입니다. 머신의 상태를 확인해주세요.");
        }
    }
}
