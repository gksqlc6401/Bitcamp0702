package net.commit.bit;

import java.util.Scanner;

public class Test2 {

  Scanner sc = new Scanner(System.in); 
  boolean[] camp = new boolean[5];
  int sel=9,num=3;

  public int menu() {
    System.out.println("\n 1.예약 2.퇴실 3.보기 9.종료");
    sel=Integer.parseInt(sc.nextLine());
    return sel;
  }

  public void input() {
    System.out.println("예약 캠핑번호 입력:");
    num=Integer.parseInt(sc.nextLine());
    if (num<1 || num>5) {System.out.println(num+"번호를 입력할수 없습니다.");}
    if (camp [num-1]==true) {
      System.out.println("이미 예약된 캠프장입니다. 사용불가");
    }else {
      System.out.println("camp["+num+"] 캠프장 예약성공");
      camp[num-1] = true;
    }
    for (int i =0;i<camp.length; i++) {
      if (camp[i]==true) {
        System.out.println(" "+(i+1)+"번째 ⬛캠프 사용중입니다.");
      }else {
        System.out.println(" "+(i+1)+"번째 ⬜캠프 비어있습니다.");
      }
    }//for end
  }

  public void output() {
    System.out.println("퇴실 캠핑 번호입력:");
    num=Integer.parseInt(sc.nextLine());
    if (camp[num-1]==true) {
      System.out.println("퇴실 성공했습니다.");
      camp[num-1]=false;
    }else {
      System.out.println("camp["+num+"]비어있는 캠핑장입니다.");
    }
    for (int i =0;i<camp.length; i++) {
      if (camp[i]==true) {
        System.out.println(" "+(i+1)+"번째 ⬛캠프 사용중입니다.");
      }else {
        System.out.println(" "+(i+1)+"번째 ⬜캠프 비어있습니다.");
      }
    }//for end
  }

  public void list() {
    for (int i =0;i<camp.length; i++) {
      if (camp[i]==true) {
        System.out.println(" "+(i+1)+"번째 ⬛캠프 사용중입니다.");
      }else {
        System.out.println(" "+(i+1)+"번째 ⬜캠프 비어있습니다.");
      }
    }//for end
  }

  public void quit() {
    if (sel==9) {
      System.out.println("캠핑장 예약 프로그램을 종료합니다.");
    }
  }
}
