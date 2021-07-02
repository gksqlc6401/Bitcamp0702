package net.hb.day0628;

public class Bank {
  //자바언어는 객체지향언어
  //챕터6장 5 생성자=constructor Oriented Programming
  //챔터6장 4 오버로딩 메소드중복. 생성자 중복가능
  private int pwd=1234;//private키워드는 현재 클래스에만 적용
  Bank() {

  }
  void cal() { System.out.println(pwd);}
  public void cal(int m) {}//입금
  public void cal(String name, int m) { }//어느은행, 입금
}//class END