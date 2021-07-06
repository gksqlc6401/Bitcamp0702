package net.hb.day0702;



import java.util.Scanner;
import net.hb.day0628.Work05Hotel;

public class Game {

  private String[][] name = new String[3][5];
  private boolean[][] status = new boolean[3][5];
  Scanner sc = new Scanner(System.in);

  public void process() {

    for(int i=0 ; i<3; i++) {
      for(int j=0 ; j<5; j++) {
        name[i][j] = "\t";
      }
    }

    while(true) {
      System.out.println("----------------호텔 예약 프로그램-----------------");
      System.out.println("1. 입실  2. 퇴실  3. 예약현황  4. 고객목록  9. 종료");
      System.out.println();
      System.out.print("번호 입력 : ");
      int sel;
      try {
        sel = Integer.parseInt(sc.nextLine());
      } catch (Exception e) {System.out.println("숫자만 입력하여 주세요.\n");
      continue;}
      if (sel==9) {
        System.out.println("호텔 예약프로그램을 종료합니다.");
        return;
      }
      switch(sel) {
        case 1 : checkIn(); break;
        case 2 : checkOut(); break;
        case 3 : map(); break;
        case 4 : list(); break;
        default : 
          System.out.println("잘못된 숫자를 입력하셨습니다.\n");
          break;
      }
    }
  }

  public void checkIn() {
    int a = 0;
    int b = 0;
    int c = 0;
    while(true) {
      System.out.println("\n몇 호에 투숙하시겠습니까?");
      System.out.print("방 번호 입력 : ");
      String sel = sc.nextLine();
      String arr[] = sel.split("");
      try {
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[2]);
        c = Integer.parseInt(arr[1]);
      } catch (Exception e) {System.out.println("숫자만 입력하여 주세요.");
      continue;}
      if (a<1 || a>3 || b<1 || b>5 || c !=0) {
        System.out.println("잘못된 번호를 입력하셨습니다.");
        continue;}
      if (status[a-1][b-1] == true) {
        System.out.println("해당 룸은 현재 예약이 되어 있습니다.");
        continue;
      } else { System.out.println("\n성함을 입력하여 주세요.");
      System.out.print("성함 입력 : ");
      String names = sc.nextLine();
      name[a-1][b-1] = names;
      status[a-1][b-1] = true;
      System.out.println("예약이 정상적으로 완료되었습니다.\n");
      }
      break;
    }
  }

  public void checkOut() {
    int a = 0;
    int b = 0;
    int c = 0;
    while(true) {
      System.out.println("\n몇 호를 체크아웃 하시겠습니까?");
      System.out.print("방 번호 입력 : ");
      String sel = sc.nextLine();
      String arr[] = sel.split("");
      try {
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[2]);
        c = Integer.parseInt(arr[1]);
      } catch (Exception e) {System.out.println("숫자만 입력하여 주세요.");
      continue;}
      if (a<1 || a>3 || b<1 || b>5 || c !=0) {
        System.out.println("잘못된 번호를 입력하셨습니다.");
        continue;}
      if (status[a-1][b-1] == true) {
        System.out.println("정상적으로 체크아웃 되었습니다.\n");
        name[a-1][b-1] = "\t";
        status[a-1][b-1] = false;
        break;
      } else { System.out.println("현재 호실은 비어있습니다.");
      continue;
      }
    }
  }

  public void map() {
    System.out.println("\n-------------예약 현황-------------");
    for(int i=0 ; i<3; i++) {
      for(int j=0 ; j<5; j++) {
        System.out.print((i+1)+"0"+(j+1)+"\t");
        if(j==4) {
          System.out.print("\n");
        }
      }
      for(int b=0 ; b<5; b++) {
        System.out.print(name[i][b]);
        if(b==4) {
          System.out.println("\n");
        }
      }
    }
  }

  public void list() {
    System.out.println("\n-----고객 목록-----");
    for(int i=0 ; i<3 ; i++) {
      for(int j=0 ; j<5 ; j++) {
        if (name[i][j] == "\t") {
          System.out.println((i+1)+"0"+(j+1)+"호 : 공실입니다.");
        } else {
          System.out.println((i+1)+"0"+(j+1)+"호 : "+name[i][j]+"님 투숙중");
        }
        if(j==4) {
          System.out.println();
        }
      }
    }
  }

  public static void main(String[] args) {
    Work05Hotel wh = new Work05Hotel();

    wh.process();
    wh.sc.close();
  }
}