package net.commit.bit;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    System.out.println("1차원 배열 캠프예매 28일 월요일 19:15");
    Scanner sc = new Scanner(System.in); 
    boolean[] camp = new boolean[5];
    int sel=9,num=3;

    Test2 get = new Test2();

    for (int i =0;i<camp.length; i++) {
      if (camp[i]==true) {
        System.out.println(" "+(i+1)+"번째 ⬛캠프 사용중입니다.");
      }else {
        System.out.println(" "+(i+1)+"번째 ⬜캠프 비어있습니다.");
      }
    }//for end
    loop : while (true) {
      try {
        sel = get.menu();  
        switch (sel) {
          case 1: get.input();//입실처리
          break;
          case 2: get.output();//퇴실
          break;
          case 3: get.list();//전체 예약상태
          break ;
          case 9: get.quit();
          break loop;
          default:
            System.out.println("1~3번째 메뉴를 선택하셔야 됩니다");
            break;
        }//switch end
      }catch(Exception ex){ }
    }//while end
    sc.close();
  }//main end
}//class end
