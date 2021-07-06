package net.commit.bit;

public class Dunkin {
  public Dunkin() {

  }

  public String coffee(){ 
    //Non-static메소드, 리턴값
    //객체화생성후 객체명.coffee();
    String kind="아이스라떼";
    return kind;
  }//end

  public void donuts(int cnt){
    System.out.println("도너츠 메소드 주문갯수"+cnt+"입니다");
    //static메소드 메소드(매개인자)
    //Dunkin.donuts(3);접근
  }//end

  public void menu() { //리턴값X, 매개인자X

  }//end
}//class END