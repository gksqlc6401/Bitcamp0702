package net.commit.bit;

import java.util.Scanner;

public class CampTest3 {

  public static void main(String[] args) {
    System.out.println("1차원배열 캠프예매 28일월요일 3:40 ");
    Scanner sc=new Scanner(System.in);
    boolean[] camp = new boolean[5]; //배열선언되면 자동으로 false초기값 세팅
    int sel=9, num=0;

    CampText2 campTest = new CampText2();

    //캠핑장 예약상태확인 
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end

    loop : while(true) {
      try {
        sel = campTest.menu();
        switch(sel) {
          case 1: campTest.input();//입실처리
          break;  
          case 2:campTest.output();//퇴실은 조별/개인별처리
          break;  
          case 3: campTest.printAll();//전체예약상태
          break; 
          case 9: campTest.myExit();
          break loop;
        }//switch end*/
      }catch (Exception ex) {  } 
    }//while 
    //sc.close();
  }//end
}//class END