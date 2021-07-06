package net.commit.bit;

import java.util.Scanner;

public class Work03emp {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String sabun="0";
    String name = "홍길동";
    while(true) {
      System.out.println("사번입력:");
      sabun = sc.nextLine();
      try {
        Integer.parseInt(sabun);
        break;
      }catch (Exception e) { System.out.println("숫자만 입력해주세요!"); }
      continue;}
    System.out.println("이름입력:");
    name = sc.nextLine();



    System.out.println("");
    System.out.println("사번입력:"+sabun);
    System.out.println("이름입력:"+name);
  }
}


