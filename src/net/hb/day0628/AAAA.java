package net.hb.day0628;

import java.util.Scanner;

public class AAAA {

  Scanner sc = new Scanner(System.in);

  private int floor;
  private int room;
  private String[][] name=new String[3][5];
  private String title;

  public AAAA() { }
  public AAAA(String name) { }
  public AAAA(String name, int year) { }

  public void process() {

    int sel =9;
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        name[i][j]="\t";
      }
    }


    while (true) {
      System.out.print("\n 1.입실 2.퇴실 3.map 4.list 9.종료");
      sel=Integer.parseInt(sc.nextLine());
      if (sel==9) {
        System.out.println("호텔예약 프로그램이 종료 되었습니다.");
        System.exit(1);
      }

      switch(sel) {
        case 1 : checkIn(); break;
        case 2 : checkOut(); break;
        case 3 : map(); break;
        case 4 : list(); break;
      }
    }
  }

  public void checkIn() {
    System.out.println("몇층?");
    String f=sc.nextLine();
    floor =Integer.parseInt(f);
    System.out.println("몇호?");
    String r =sc.nextLine();
    room = Integer.parseInt(r);

    if(name[floor-1][room-1] == "\t") {
      System.out.println("이름?");
      name[floor-1][room-1]=sc.nextLine();
      System.out.printf("%s님 체크인 되셨습니다.", name[floor-1][room-1]);
    }else if(name[floor-1][room-1] != "\t"){
      System.out.println("예약 불가능 합니다.");
    }
  }
  public void checkOut() {
    System.out.println("몇층?");
    String f = sc.nextLine();
    floor=Integer.parseInt(f);
    System.out.println("몇호?");
    String r = sc.nextLine();
    room = Integer.parseInt(r);

    if(name[floor-1][room-1]!="\t") {
      System.out.print("성함?");
      name[floor-1][room-1]=sc.nextLine();
      System.out.printf("%s님 체크아웃 되셨습니다. 안녕히가세요",name[floor-1][room-1]);
      name[floor-1][room-1]="\t";
    }else if(name[floor-1][room-1]=="\t") {
      System.out.println("빈방이여서 체크아웃을 할수 없습니다. 호수를 다시 입력해주세요!");
    }
  }

  public void map() {
    for(int i=0; i<3; i++) {
      for(int j=0; j<5; j++) {
        if (name[floor-1][room-1]=="\t") {
          System.out.printf("\t⬜:%d0%d ", i+1,j+1);
        }else if( name[floor-1][room-1]!="\t") {
          System.out.println(System.out.printf("\t⬛:%d0%d ", i+1,j+1));
        }
      }
    }

  }

  public void list() {

  }
  public static void main(String[] args) {
    AAAA h = new AAAA("");
    h.process();
  }
}