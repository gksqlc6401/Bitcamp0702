package net.hb.day0628;

public class TestNote {

  public static void main(String[] args) {
    System.out.println("최한빛 9:42");
    System.out.println("김영임 9:42");
    TestNote tn = new TestNote();

  }//main end
  //문제 1번 같은문서의 메소드 호출

  public String book() {
    String my = "몽블랑" ;
    return my;
  }
  public int price() {
    int money = 2700;
    return money;
  }

  public void note() {
    String title = book();
    int title1 = price();

    System.out.println("책제목:" + title);
    System.out.println("책제목" + book() );
    System.out.println("책제목" + price() );

  }
}
