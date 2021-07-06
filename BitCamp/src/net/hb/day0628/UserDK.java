package net.hb.day0628;

import net.commit.bit.Dunkin;

public class UserDK {

  public static void main(String[] args) {
    //문제 Dunkin클래스 coffee메소드 donuts메소드 호출
    System.out.println("3:35분 오후 UsersDK클래스");
    Dunkin.donuts(3);
    
    Dunkin dk = new Dunkin();
    String msg = dk.coffee();
    System.out.println("주문한 음료는"+msg+"입니다.");
  }//end
}//class end
