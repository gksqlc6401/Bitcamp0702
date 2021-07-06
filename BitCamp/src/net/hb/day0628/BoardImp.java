package net.hb.day0628;

public interface BoardImp {
  //class키워드대신 interface
  //인터페이스 메소드를 선언만 = 추상메소드 abstract method
  //인터페이스 = 메모 = 명세서
  //인터페이스 상속을 받아서 재활용 = 재정의 =OverRiding = 오버라이딩
  //상속받은 클래스에서 재정의 의미 @OverRiding 생략가능
  public abstract int boardCount();
  public abstract boolean boardInsert();
  public void boardDelete(int num);
}//interface END
