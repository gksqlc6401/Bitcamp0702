package net.hb.day0628;

import java.util.Scanner;

public class SJUser1 {

  Scanner sc = new Scanner(System.in);

  //private int floor;;
  //private int room;
  private boolean[][] tf= new boolean[3][5];
  private String[][] name=new String[3][5];
  private String title;

  public SJUser1() { }
  public SJUser1(String name) { }
  public SJUser1(String name, int year) { }

  int sel =9;
  int dong =0;
  int ho =0;
  int sen =0;

  public void process() {

    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        name[i][j]="\t";
      }
    }

    while (true) {
      System.out.println();
      System.out.println("\n----------호텔 예약 프로그램-----------");
      System.out.print("\n 1.입실  2.퇴실  3.map  4.list  9.종료");
      System.out.println();
      System.out.print("번호입력 : ");
      try {
        sel=Integer.parseInt(sc.nextLine());
      }catch (Exception e) {System.out.println("숫자만 입력해주세요!\n");
      continue;}
      if (sel==9) {
        System.out.println("호텔예약 프로그램이 종료 되었습니다.");
        System.exit(1);
      }

      switch(sel) {
        case 1 : checkIn(); break;
        case 2 : checkOut(); break;
        case 3 : map(); break;
        case 4 : list(); break;
        default :
          System.out.println("잘못된 번호를 입력하셨습니다.");
          break;
      }
    }
  }

  public void checkIn() {

    while (true) {
      System.out.println("몇 호에 체크인 하시겠습니까?");
      System.out.print("방 호수 입력 :");
      String sel = sc.nextLine();
      String arr[] = sel.split("");
      try {
        dong = Integer.parseInt(arr[0]);
        ho = Integer.parseInt(arr[2]);
        sen = Integer.parseInt(arr[1]);
      }catch (Exception e) {System.out.println("숫자만 입력해주세요!");
      continue;}
      if(dong<1 || dong>3 || ho<1 || ho>5 || sen!=0) {
        System.out.println("잘못된 호수를 입력하셨습니다.");
        continue;}
      if(tf[dong-1][ho-1] == true) {
        System.out.println("예약 불가능 합니다");
      }else {
        System.out.println("성함이 어떻게 되시나요?");
        System.out.print("성함 입력 :");
        name[dong-1][ho-1]=sc.nextLine();
        System.out.printf("%s님 예약 되었습니다.",name[dong-1][ho-1]);
      }
      break;
    }
  }

  public void checkOut() {
    while (true) {
      System.out.println("몇호에서 체크아웃 하시겠습니까?");
      System.out.print("호수 입력 :");
      String sel= sc.nextLine();
      String arr[]= sel.split("");
      try {
        dong= Integer.parseInt(arr[0]);
        ho= Integer.parseInt(arr[2]);
        sen= Integer.parseInt(arr[1]);
      }catch (Exception e) {System.out.println("숫자만 입력하세요!");
      continue;}


      if (dong<1 || dong>3 || ho<1 || ho>5 || sen!=0) {
        System.out.println("잘못된 호수를 입력하셨습니다.");
        if(tf[dong-1][ho-1] == true) {
          System.out.printf("%s님 퇴실되었습니다. 안녕히 가세요!",name[dong-1][-1]);
          name[dong-1][ho-1]="\t";
          tf[dong-1][ho-1] = false;
          break;
        } else { System.out.println("현재 호실은 비어있습니다.");
        continue;
        }
      }
    }
  }
  public void map() {
    System.out.println("\t-------실시간 호텔예약 현황--------- \n"+"\t⬛: 예약 불가  ⬜:예약가능");
    /*for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        System.out.printf("\t%d0%d ",i+1, j+1);
      }
    }*/
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        if(name[i][j] == "\t") {
          System.out.printf("\t□ %d0%d ", i+1, j+1);
        }else {
          System.out.printf("\t■ %d0%d ", i+1, j+1);
        }
      }
      /* for(int j=0; j<5; j++) {
        System.out.printf("\t%s", name[i][j]);
      }*/
      System.out.println("\n-------------------------------------------------------------");
    }
  }


  public void list() {
    System.out.println("------------고객님 예약 리스트-----------");
    for (int i=0; i<3; i++) {
      for (int j=0; j<5; j++) {
        System.out.printf("\n\t%d0%d호 \t%s",i+1, j+1, name[i][j]+"고객님 입실중");
      }
    }
    /*for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        System.out.printf("\t%s", name[i][j]);
      }
    }*/
  }
  public static void main(String[] args) {
    SJUser1 h = new SJUser1("");
    h.process();
  }
}