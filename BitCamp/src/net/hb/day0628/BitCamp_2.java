package net.hb.day0628;

public class BitCamp_2 extends LG{

  public static void main(String[] args) { //LA 상속
    BitCamp_2 book = new BitCamp_2();
    book.book();
    book.cherry();

  }
  public void book() {
    System.out.println("book 몽블랑");
    //this.cherry(); //this 생략가능  static에서는 super,this 사용못함. 에러
    //super.cherry();
  } 

  @Override
  public void cherry() {
    //super.cherry();{
    System.out.println("제주산 체리11:09");
  }
}


