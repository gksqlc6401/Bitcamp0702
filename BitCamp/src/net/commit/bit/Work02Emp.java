package net.commit.bit;

import java.util.Scanner;

public class Work02Emp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String name ="홍길동";
    String sabun="0";
    //문제 키보드 입력 Scanner클래스 반드시 입력해서 출력, 예외처리, 형변환
    while (true) {
      System.out.println("사번입력:");
      sabun=sc.nextLine();
      try {
        Integer.parseInt(sabun);
        break;
      }catch (Exception e) { System.out.println("숫자만 입력해");
      continue;}
    }

    System.out.println("이름입력:");
    name=sc.nextLine();
    System.out.println();
    System.out.println("사번:"+sabun);
    System.out.println("이름:"+name);
  }
}
//end
//class end
