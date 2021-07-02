package net.hb.day0628;


public class BitCamp_3 extends LG{
  public BitCamp_3() { this("종로점",7,"java"); }
  public BitCamp_3(String location) { }
  public BitCamp_3(int pos) { }
  public BitCamp_3(String location,int pos, String subject) { 
    System.out.println(location +" 지점 "+ pos +"층"+subject+"입니다.");
  }

  public static void main(String[] args) { //LA 상속
    BitCamp_3 book = new BitCamp_3();
    book.coffee(); 
    //book.cookie();

  }
  public void coffee() {// Non-static
    System.out.println("coffee 맥심 카누");
    cookie();
    //this.cherry(); //this 생략가능  static에서는 super,this 사용못함. 에러
    //super.cherry();
  } 
  public void cookie() {
    System.out.println("cookie 매운새우깡");
  }
}


